package object06;
/*
  싱글톤 패턴
  : 객체지향 개발 디자인 패턴 중 인스턴스를 단 한개만 생성해서 사용하는것
  	static에 인스턴스 하나만 구현해 놓음
  싱글톤 패턴 규칙
  1. (반드시) 생성자를 private로 만듬 => 클래스 내부에서 생성하고 제어할 수 있기 때문에
  2. 클래스 내부에서 static으로 (유일한) 인스턴스를 생성해야 함
  3. 메서드는 (반드시) public으로 코딩=> 인스턴스 외부에서 사용할 수 있도록
  4. 싱글톤 인스턴스를 접속하여 실제 구현 코드를 만듬 => Oop11SingletonPatternTest.java에서 사용
  
  공통작업, 공통 클래스
  개발자 누구나 싱글패턴을 사용하면 패턴이
  엉망이되기 때문에 보통 PL이 정한다.
 */
public class Oop11SingletonPattern {
	
 //1. static으로 생성
 private Oop11SingletonPattern() {}
 
 //2. static으로 생성
 private static Oop11SingletonPattern instance = new Oop11SingletonPattern();
 
 //3. 메서드
 public static Oop11SingletonPattern getInstance() {
	 if(instance==null) {// 기본값(null)이면 
		 instance = new Oop11SingletonPattern();// 생성해줘;
	 }
	 return instance;    //유일한 인스턴스인 싱글톤 인스턴스를 반환
 }
 
}
