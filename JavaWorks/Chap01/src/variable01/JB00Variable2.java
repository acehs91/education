package variable01; 
/*
  변수 : 값이 변할 수 있는 데이터 
  Java에서는 반드시 명확한 DataType(데이터형)을 선언해 줘야 함
  JVM은 명확한 데이터만 컴파일하게 설계됨 = 합리성을 위해
  
  변수 할당 = 지역변수는 반드시 초깃값 선언을 해야 예외발생 안함
  : a.변수선언 -> b.변수 초깃값 -> c.변수값 할당
  변수 선언 형식 : DataType(데이터형) 변수명;
  
  
  #데이터 타입
  - 기본형(primitive)타입 : 정수, 실수, 문자, 논리 값들(리터럴 = 값 그 자체)을 직접 저장하는 타입
    각각 데이터 타입의 저장할 수 있는 크기에 따라 선언 키워드가 달라진다.
     
    1.정수형(Integer type) = byte, short, int, long, char 
      - 정수형은 int가 기본형 / char는 문자형이지만 , 내부적으로 숫자로 처리되기 때문에 계산에도 활용 가능
    2.실수(Floating point type) = float, double 
      - 실수형은 double이 기본형
    3.논리(Boolean type) =  true / false 
      - boolean은 논리 판단에만 사용
    4.문자형(Character type) = char → 'A'처럼 한 글자 저장
    
    Java에서 대문자 시작 = 클래스/타입, 소문자 시작 = 변수/메서드
	
	단축키 
	: Ctrl+F11 = 실행
	
	단축어
	: sysout = Crtl + Spacebar = System.out.println();
*/
public class JB00Variable2 {
	public static void main(String[] args) {
		
		// 1. 변수선언
		int point;
		
		// 2. 변수초깃값
		point = 0;
		
		// 3. 변수값 할당 - out은 시스템 소속으로 println 해달라는 뜻
		System.out.println(point); 
		
		// a.숫자형
		int num = 100;
		System.out.println(num);
		
		// b.실수형
		double num2 = 100.1;
		System.out.println(num2);
		
		// c.실수형
		boolean bool =false;
		System.out.println(bool);
		
		// 문자열 
		String str = "First Java";
		System.out.println(str);

		
	}
}
