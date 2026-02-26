package scanner04;
// 객체 생성 실습
import java.util.Scanner;

public class OJ02ScannerExe {

   public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in); 
	   
	   String q1 = "이름은 무엇인가요?";
	   System.out.println(q1);
	   
	   String name = scan.next(); // 프롬프트 받은 이름
       
	   String q2 = "영어점수 입력";
	   System.out.println(q2);
	   
	   int engScore = scan.nextInt(); // 프롬프트 받은 점수 
       
	   System.out.println( name + " : " + engScore +"점");
      
   }

}
