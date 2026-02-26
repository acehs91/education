package abstract10;
/*
 추상 클래스 구현 하는 클래스
 : 추상클래스 설계도에 따라 각각 다르게 메서드를 구현할 수 있음
   사용하고 싶은 추상클래스를 상속 받아서 사용함
*/
public class DeskTop extends Abstract01Basic{
	
	@Override
	public void display() {
		System.out.println("DeskTop클래스 : 상속받은 추상클래스 display 메서드 구현");
	}
	
	@Override
	public void typing() {
		System.out.println("DeskTop클래스 : 상속받은 추상클래스 typing 메서드 구현");
	}
}
