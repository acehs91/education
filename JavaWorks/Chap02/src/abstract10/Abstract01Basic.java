package abstract10;
/*
 * Abstract(추상적) Class
 * = 완전하지 않은 클래스
 * = 구체적이지 않은 클래스 => 가능성이 남아있는 클래스 => 가능성을 확정해 다양한 프로그램을 개발할 수 있는 클래스
 * 
 * (추상클래스 기본)
 * : (반드시) 추상 메서드를 포함 = 추상 메서드에는 구현 코드가 없음(즉, {} 메서드 구현부가 없음)
 * 
 * (추상클래스 원칙)
 * : 추상 클래스를 상속받은 하위 클래스는 (무조건) 추상메소드를 모두 구현해야 함
 *   => 구현하면 구체적은 클래스(Concreate Class)가 됨
 *      만약, 하나라도 구현하지 않으면 => '추상 클래스'임
 * (추상클래스 예약어)
 * = Abstract
 *      
 */

public abstract class Abstract01Basic {
	
  // 1. 추상 메서드 선언 = 예약어 abstract 사용
  public abstract void display();
  public abstract void typing();	
  
  // 2. 일반 메서드 구현도 가능
  public void turnOn() {
	  System.out.println("일반메서드 : (기능)전원을 켬");
  } 
  
  public void turnOff() {
	  System.out.println("일반메서드 : (기능)전원을 끔");
  } 
}
