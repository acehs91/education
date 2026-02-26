package oop02;
/*
	추상메서드
	[형식] abstract class 클래스명{...}
	: 미완성 설계도 개념으로 개발을 위한 기본틀만 있다고 보면 됨
	  추상 메서드를 포함하고 있다는 뜻도 됨
	  추상 메서드를 포함하고 있다는 것만 제외하고는, 일만 클래스와 크게 다르지 않음
	  = 생성자, 멤버변수, 메서드도 가질 수 있음
	  
	추상 클래스 사용이유
	: 새로운 클래스 작성시 완전히는 못해도 어느정도 틀을 갖춘 상태에서 시작하는 것이 훨씬 효율적
	  예) TV의 기능 90%는 활용 = 공통부분 = 공통부분을 추상 클래스로 구현함
	     TV의 나머지 신기술을 구현하면 최신 TV가 됨 => 공통부분 상속 후 나머지 부분만 구현하면 효율적이 됨
	     
	추상메서드
	: 선언부만 작성하고, 구현부는 작성하지 않은 채로 남겨 둔 것
	  = 설계만 해놓고, 실제 수행내용은 작성하지 않았기 때문에 미완성 메서드
	  = 메서드의 내용이 추상클래스를 상속받은 클래스에 따라 달라지기 때문에 알아서 구현하도록 비워둔 것
	  
	추상 메서드 선언부가 중요한 이유
	: 선언부만 알고 있으면, 구현시 힌트가 되서 추상메서드를 사용하는 코드 작성이 가능
	
	추상 클래스를 상속받은 클래스는 '반드시' 오버라이딩을 통해 추상메서드를 '모두' 구현해 주어야 함
 */

//내부 추상
abstract class Common {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
	}
}

//내부 1
class Worker1 extends Common {
	@Override
	void move(int x, int y) {
		System.out.println("Worker1 : x = " + x + ", y = " + y);
	}
}

//내부 2
class Worker2 extends Common {
	@Override
	void move(int x, int y) {
		System.out.println("Worker2 : x = " + x + ", y = " + y);
	}
}

//내부 3
class Worker3 extends Common {
	@Override
	void move(int x, int y) {
		System.out.println("Worker3 : x = " + x + ", y = " + y);
	}
}

public class Abstract06 {
	public static void main(String[] args) {
		// 객체를 배열에 할당 = team
		Common[] team = { new Worker1(), new Worker2(), new Worker3() };
		for (Common wTeam : team) {
			wTeam.move(100, 200);
		}
	} // /main
}

