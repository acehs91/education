package scanner04;

// 객체 import
import java.util.Scanner;

public class OJ01Scanner {

    public static void main(String[] args) {
    
        // Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        // new Scanner → (키보드로부터 입력받은 표준 입력 스트림)을 전달

        /*  a. 정수값 입력받기 (int) */
        System.out.println("정수를 입력하세요.");
        int num = scan.nextInt();         // 예) 10 입력
        System.out.println("입력한 정수: " + num);

        /*  b. 문자열(단어) 입력받기 (String) */
        System.out.println("문자를 입력하세요.");
        String name = scan.next();         // 예) Hello 입력
        System.out.println("입력한 문자: " + name);

        /* Scanner 주요 메서드 정리 (입력 타입별) */
        System.out.println("\n[Scanner 입력 메서드 예시]");

        // 정수형 계열
        System.out.print("byte 입력 ");
        byte a = scan.nextByte();          // 예) 100
        System.out.println("입력값(byte): " + a);

        System.out.print("short 입력 ");
        short b = scan.nextShort();        // 예) 30000
        System.out.println("입력값(short): " + b);

        System.out.print("int 입력");
        int c = scan.nextInt();            // 예) 2000000
        System.out.println("입력값(int): " + c);

        System.out.print("long 입력");
        long d = scan.nextLong();          // 예) 12345678900
        System.out.println("입력값(long): " + d);

        // 실수형 계열
        System.out.print("float 입력");
        float e = scan.nextFloat();        // 예) 3.14
        System.out.println("입력값(float): " + e);

        System.out.print("double 입력");
        double f = scan.nextDouble();      // 예) 12.3456
        System.out.println("입력값(double): " + f);

        // 논리형
        System.out.print("boolean 입력(true/false)");
        boolean g = scan.nextBoolean();    // 예) true
        System.out.println("입력값(boolean): " + g);

        // 문자열형 (단어 단위)
        System.out.print("String 입력");
        String h = scan.next();            // 예) hello
        System.out.println("입력값(String): " + h);
    }
}
