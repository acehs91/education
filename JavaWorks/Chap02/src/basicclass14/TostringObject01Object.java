package basicclass14;
/*
  java.lang 패키지
  : 기본 패키지로 가장 많이 사용 | java.lang.String. java.lang.Syetem ...
    컴파일시 java.lang 패키지는 자동으로 문장에 추가되어 하위패키지 클래스를 모두 사용
    
   Object 클래스
   : 자바 최상위 클래스 => 모든 클래스는 Object로 부터 상속 받음
   컴파일시 자동으로 extends Object가 쓰임
   즉, 모든 클래스가 Object 클래스를 상속받음으로 
     Object의 메서드를 사용할 수도 있고, 오버라이딩(재정의) Object로의 형변환 등등이 가능함
     단, final 예약어로 선언된 메서드는 오버라이딩(재정의) 할수 없음

   [공통0. toString()]
   : Object 클래스에서 기본으로 제공
   = 객체정보를 문자열로 바꾸어 줌
   = 모든 클래스는 toString()으로 오버라이딩 가능
   = java.lang.String 등등 여러 JDK제공 클래스에는 toString()으로 재정의 되어 있음
   
   [1. Object 클래스의 toString()]
   = 인스턴스 주소 정보를 문자열로 변환하여 보여줌
   = 자동으로 toString()이 호출됨 => 생략가능

*/


//연습용 내부클래스
class Book{
	//멤버변수
	int bookNumber;
	String bookTitle;
	
	//생성자
	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
}


public class TostringObject01Object {
	public static void main(String[] args) {
		Book book = new Book(100, "죄와 벌");
		System.out.println(book);
		System.out.println(book.toString());
		
	}
}

