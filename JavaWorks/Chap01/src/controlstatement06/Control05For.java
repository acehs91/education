package controlstatement06;
/*
  For문
  : 가장 많이 사용되는 반복문
  [형식]
  for(초기식; 조건식; 증감식) {
      실행문;
  }
*/

public class Control05For {
    public static void main(String[] args) {

        //기본 for문 예시
        int i;
        for (i = 0; i < 5; i++) { // i가 0~4일 때까지 반복
            System.out.println("i for문 반복횟수: " + i);
        }

        // 1부터 10까지의 합 구하기
        int sum = 0;
        for (int a = 1; a <= 10; a++) {
            sum += a; // ← 여기 원래 =+ 였는데, += 로 수정해야 정상 동작
        }
        System.out.println("1부터 10까지의 합: " + sum); // 결과: 55

        //continue문 예시
        /*
          반복문 안에서 continue를 만나면,
          아래의 실행문은 건너뛰고 다음 반복으로 바로 이동함
        */
        System.out.println("\ncontinue문 예시 (1~10 중 짝수만 출력)");
        for (int b = 1; b <= 10; b++) {
            if (b % 2 != 0) { // 홀수면 아래 실행 안하고 다음 반복으로 이동
                continue;
            }
            System.out.println(b); // 짝수만 출력됨
        }

        //중첩 for문 예시 (구구단)
        System.out.println("\n=== 구구단 출력 ===");
        int dan;
        int times;
        
        for (dan = 2; dan <= 9; dan++) { // 2단부터 9단까지
            System.out.println("[" + dan + "단]");
            
            for (times = 1; times <= 9; times++) { // 각 단의 1~9 곱
                System.out.println(dan + " x " + times + " = " + (dan * times));
            }
            System.out.println(); // 줄바꿈
        }
    }
}
