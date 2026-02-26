package object06;

public class Oop11SingletonPatternTest {
	// 사용 클래스니까 main 메서드 사용 
	public static void main(String[] args) {
		Oop11SingletonPattern.getInstance(); //인스턴스 생성
		//new 키워드 대신이라고 생각
		Oop11SingletonPattern obj1 = Oop11SingletonPattern.getInstance();
		Oop11SingletonPattern obj2 = Oop11SingletonPattern.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);  
	}
	
}
