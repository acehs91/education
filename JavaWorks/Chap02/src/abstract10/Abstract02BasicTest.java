package abstract10;
/* 추상클래스 이용하는 실행 클래스*/
public class Abstract02BasicTest {
	public static void main(String[] args) {
		// 추상 클래스 생성
		// Abstract01Basic abs = new Abstract01Basic();  // 에러
		
		// (추상 클래스 이용 ) DeskTop 클래스 사용
	
		Abstract01Basic abs2 = new DeskTop();  // 부모 타입안에 
		abs2.display();
		abs2.typing();
		abs2.turnOn();
		abs2.turnOff();
		
		Abstract01Basic abs3 = new NoteBook();  // 부모 타입으로 자식 객체를 참조
		abs3.display();
		abs3.typing();
		abs3.turnOn();
		abs3.turnOff();
		
		System.out.println("====== 패키지내 클래스 사용 ======");
		
 	    // DeskTop 클래스만 이용 => 같은 결과 나오도록 코딩
		DeskTop desk = new DeskTop(); // 자식 타입 그대로 생성
		desk.display();
		desk.typing();
		desk.turnOn();
		desk.turnOff();
		
	    // NoteBook 클래스만 이용 => 같은 결과 나오도록 코딩
		NoteBook note = new NoteBook(); // 자식 타입 그대로 생성
		note.display();
		note.typing();
		note.turnOn();
		note.turnOff();
		
	}
}
