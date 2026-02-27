# Git Auto Sync Script
# 파일 변경 시 자동 커밋 + 매일 17:30 자동 푸시

$folders = @(
    "C:\JavaWorks",
    "C:\JSPWorks",
    "C:\SpringWorks",
    "C:\SpringBootWorks",
    "C:\React"
)

$debounceSeconds = 30
$lastCommit = @{}
$pushTime = "17:30"

Write-Host "========================================" -ForegroundColor Cyan
Write-Host "  Git Auto Sync Started!" -ForegroundColor Green
Write-Host "  - 자동 커밋: 파일 저장 시" -ForegroundColor Yellow
Write-Host "  - 자동 푸시: 매일 $pushTime" -ForegroundColor Yellow
Write-Host "  Watching folders:" -ForegroundColor Yellow
foreach ($folder in $folders) {
    Write-Host "    - $folder" -ForegroundColor White
}
Write-Host "========================================" -ForegroundColor Cyan
Write-Host ""

function Commit-GitRepo {
    param([string]$path)
    
    $now = Get-Date
    $folderName = Split-Path $path -Leaf
    
    if ($lastCommit.ContainsKey($path)) {
        $diff = ($now - $lastCommit[$path]).TotalSeconds
        if ($diff -lt $debounceSeconds) { return }
    }
    
    Push-Location $path
    try {
        $status = git status --porcelain 2>$null
        if ($status) {
            $timestamp = Get-Date -Format "yyyy-MM-dd HH:mm:ss"
            Write-Host "[$timestamp] $folderName 커밋!" -ForegroundColor Yellow
            
            git add -A 2>$null
            git commit -m "Auto: $timestamp" 2>$null
            $lastCommit[$path] = $now
            Write-Host "[$timestamp] $folderName 커밋 완료!" -ForegroundColor Green
        }
    }
    finally { Pop-Location }
}

function Push-AllRepos {
    $timestamp = Get-Date -Format "yyyy-MM-dd HH:mm:ss"
    Write-Host "" -ForegroundColor Cyan
    Write-Host "[$timestamp] ===== 자동 푸시 시작 =====" -ForegroundColor Cyan
    
    foreach ($folder in $folders) {
        if (Test-Path $folder) {
            Push-Location $folder
            try {
                $folderName = Split-Path $folder -Leaf
                $ahead = git rev-list --count origin/main..HEAD 2>$null
                if ($ahead -gt 0) {
                    Write-Host "  $folderName : ${ahead}개 커밋 푸시 중..." -ForegroundColor Yellow
                    git push 2>$null
                    Write-Host "  $folderName : 푸시 완료!" -ForegroundColor Green
                } else {
                    Write-Host "  $folderName : 푸시할 내용 없음" -ForegroundColor Gray
                }
            }
            finally { Pop-Location }
        }
    }
    Write-Host "[$timestamp] ===== 자동 푸시 완료 =====" -ForegroundColor Cyan
    Write-Host ""
}

# FileSystemWatcher 설정
$watchers = @()
foreach ($folder in $folders) {
    if (Test-Path $folder) {
        $watcher = New-Object System.IO.FileSystemWatcher
        $watcher.Path = $folder
        $watcher.IncludeSubdirectories = $true
        $watcher.EnableRaisingEvents = $true
        
        $action = {
            $path = $Event.SourceEventArgs.FullPath
            $folder = $Event.MessageData
            if ($path -match "\\\.git\\") { return }
            if ($path -match "\\\.metadata\\") { return }
            Start-Sleep -Seconds 2
            Commit-GitRepo -path $folder
        }
        
        Register-ObjectEvent $watcher "Changed" -Action $action -MessageData $folder | Out-Null
        Register-ObjectEvent $watcher "Created" -Action $action -MessageData $folder | Out-Null
        Register-ObjectEvent $watcher "Deleted" -Action $action -MessageData $folder | Out-Null
        
        $watchers += $watcher
        Write-Host "Watching: $folder" -ForegroundColor Green
    }
}

Write-Host ""
Write-Host "Auto Sync 실행 중... (종료: Ctrl+C)" -ForegroundColor Cyan
Write-Host ""

# 메인 루프
$lastPushDate = ""
try {
    while ($true) {
        $now = Get-Date
        $currentTime = $now.ToString("HH:mm")
        $currentDate = $now.ToString("yyyy-MM-dd")
        
        # 17:30에 푸시 (하루 1번만)
        if ($currentTime -eq $pushTime -and $currentDate -ne $lastPushDate) {
            Push-AllRepos
            $lastPushDate = $currentDate
        }
        
        Start-Sleep -Seconds 30
    }
}
finally {
    foreach ($watcher in $watchers) { $watcher.Dispose() }
    Write-Host "Auto Sync 종료됨" -ForegroundColor Yellow
}
