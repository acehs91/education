$(document).ready(function () {
  /* scrollTo 플러스인 사용 */
  $(".gnb a").click(function (e) {
    e.preventDefault();
    // (링크될 # || Y축 위치값)
    $(window).scrollTo(this.hash || 0, 500);
  });

  /* 스크롤 100px이상 되었을때 TOP 버튼 나오도록 코딩 */
  var sa = 100;
  // scroll 이벤트 연결 = 경고창 테스트 => 캡쳐, 넘버링
  $(window).scroll(function () {
    // 스크롤 탑 정보 얻어서 변수 num에 할당 => (콘솔) 캡쳐, 넘버링
    var num = $(window).scrollTop();
    console.log(num);
    // if~else 효과메서드 = 소스캡쳐, 넘버링
    if (num >= sa) {
      $("aside div").stop().fadeIn();
    } else {
      $("aside div").stop().fadeOut();
    }
  });

  /* animate 이용 부드러운 스크롤탑 이동 */
  $(".top").click(function (e) {
    e.preventDefault();
    $("html,body").stop().animate({ scrollTop: 0 }, 1000, "swing");
  });
}); // eor
