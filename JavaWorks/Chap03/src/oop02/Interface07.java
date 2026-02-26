package oop02;

/*
	인터페이스(Interface) = 밑그림 그려져 있는 기본 설계도
	: 일종의 추상클래스
	  추상메서드 + 상수만을 멤버로 가질 수 있음
	  추가적으로 디폴드 메서드, static 메서드 => 다른 클래스 작성에 도움을 줄 목적으로 작성
	  
	인터페이스 규칙
	: 클래스와 작성하는 방법이 같음, 단지 키워드 interface 사용
	  접근제어자 = public, default 사용
	  [형식]
	  interface 인터페이스명 {
	  	public static final  타입 상수명 = 값;
	  	public abstract 메서드명 (매개변수);
	  }
	  
	인터페이스 제약사항 = 제어자 생략가능, 편의상 생략을 많이 함 => 생략시 컴파일러가 자동으로 추가
	  a. 모든 멤버변수 = final String KD = "Academy"
	  b. 모든 메서드 = String ezen();
	  참고) static 메서드와 default 메서드는 명시적 코딩해줘야함
	  
	상속 : 다중상속 가능, 최고 조상이 없음
	
	구현
	: [키워드] implements를 사용하여 클래스 구현
	  인터페이스 정의된 모든 추상메서드를 구현해야 함
	  만약, 구현하는 인터페이스 메서드 중 일부만 구현애햐 한다면 abstract를 붙여 추상클래스로 선언해야 함
	  또한, 상속과 구현을 동시에 할 수 있음 (예) class KD extends Academy implements Best{}
	  
	다형성
	: 해당 인터페이스 타입을 참조변수로 => 이를 구현한 클래스의 인스턴스 참조가능 => 인터페이스 타입으로 형변환
	
	장점
	  ㄱ. 개발시간 단축
	    = 메서드 호출 쪽에서 내용에 관계없이 선언부만 알면 되기 때문에
	      동시에 다른 한쪽에서 인터페이스를 구현하는 클래스를 작성하게 되면, 양쪽에서 동시에 개발 진행 가능
	  ㄴ. 표준화 가능
	    = 기본 틀이 있기 때문에 정형화된 개발 사능
	  ㄷ. 서로 관걔 없는 클래스들에게 관계를 맺어줄 수 있음
	    = 하나의 인터페이스를 공통으로 구현하게 암으로써
	  ㄹ. 독립적인 프로그래밍 가능
	    = 한 클래스의 변경사항이 관련된 다른 클래스에 영향을 미치지 않고 독립적인 프로그래밍 가능
 */
public class Interface07 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
		c.method2();
		TestInterface.staticMethod();

	}

}

/*
 * // 인터페이스 interface TestInterface{ default void method1() {}; default void
 * method2() {}; default void method3() {}; } // 인터페이스 구현 클래스 class test
 * implements TestInterface{
 * 
 * @Override void method1() { System.out.println("인터페이스 1 method 1"); }
 * 
 * @Override public void method2() { System.out.println("인터페이스 2 method 2"); }
 * 
 * @Override public void method3() { System.out.println("인터페이스 3 method 3"); } }
 */
/* 인터페이스 구현 클래스 */
class Child extends Parent implements TestInterface {

	@Override
	public void method1() {
		System.out.println("인터페이스 구현 클래스 method1 오버라이딩");
	}

}

/* 상위 클래스 */
class Parent {
	public void method2() {
		System.out.println("상위 클래스 method");
	}
}

/* 인터페이스 */
interface TestInterface {
	// 디폴트 메서드
	default void method1() {
		System.out.println("인터페이스1 method1");
	}

	default void method2() {
		System.out.println("인터페이스2 method2");
	}

	default void method3() {
		System.out.println("인터페이스3 method3");
	}

	// static 메서드
	static void staticMethod() {
		System.out.println("인터페이스 static 메서드");
	}

}
