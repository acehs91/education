package datatype02;
/*
  데이터 타입에 따라 계산할 수 있는 연산이 다름
  따라서 데이터 타입을 반드시 알아야 함
  숫자형, 문자형 데이터 타입이 핵심
*/
public class JB01DataType {
 public static void main(String[] args) {
	// 1. 숫자형
 	System.out.println(2);
 	// 2. 문자형
 	System.out.println("2");
 	// 3.연산예시
 	System.out.println(2+2);   // 사칙연산
 	System.out.println("2" + 2); //문자열 결합
 	//System.out.println("2" * 2); //예외발생(오류) => 문자열은 연산이 안됨
 	
 	//문자열 길이 메서드
 	System.out.println("문자열길이자동계산".length()); //.length는 반드시 *문자열 소속된 결과값을 알려줌 = 9;
 	
 	}
}
