package datatype02;

/*
  Escape 문자 
  = 다음에 오는 회피문자 => 일부 컴파일러는 다르게 나오거나 비정산 적인 결과를 제공할수있음

  예)
   \t  → 탭(tab)
   \n  → 줄바꿈(new line)
   \b  → 백스페이스 (단어사이공백제거)
   \'  → 작은따옴표
   \"  → 큰따옴표
   \\  → 역슬래시 자체
*/

public class JB05Escape {
    public static void main(String[] args) {
        System.out.println("Hello" + "\t" + "World" + " 탭문자열");
        System.out.println("Hello" + "\n" + "World" + " 개행문자");
        System.out.println("Hello" + "\b" + "World" + " 백스페이스");
        System.out.println("Hello" + "\'" + "World" + "\'" + " 작은따옴표");
        System.out.println("Hello" + "\"" + "World" + "\"" + " 큰따옴표");
        System.out.println("Hello" + "\\" + "World" + "\\" + " 백슬래시");
    }
}