package interface11;
/*
 인터페이스(Interface) = 개발식 설명문서
 : 모든 메서드가 추상메서드로 이루어져 있는 클래스 또는 프로그램이 제공하는 기능을 명시적으로 선언만 한것
   즉, 추상메서드 + 상수로 이루어져 있음(기본개념)
   모터페이스는 인스턴스 생성이 불가능 함 = 추상클래스와 같음
   => 전반적인 자바프로그래밍 개발시 인터페이스에 설계를 한다고 보면됨
*/

/*
 (참조) 상수선언 방법
 public static final 예약어 사용
 => 인터페이스에서 사용시 생략가능 (=컴파일시 자동으로 상수로 변환해줌)
*/

public interface Interface01Calcul {
	//인터페이스 변수 = 상수임
	double PI = 3.14;
	int ERROR = -999999;
	// 인터페이스 메서드 = 추상메서드만 가능 = 컴파일시 자동으로 추상메서드로 변환 
	//							  => 구현코드가 없음 = abstract 예약어 생략가능
	int add(int num1, int num2);
    int substract(int num1, int num2); // 오타 유지 시 구현도 동일 명칭으로
    int times(int num1, int num2);
    int divide(int num1, int num2);
}
