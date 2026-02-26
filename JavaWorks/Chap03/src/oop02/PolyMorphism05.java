package oop02;

/*
	다형성(Polymorphism)
	: 여러가지 형태를 가질 수 있는 능력
	  한 타입의 참조변수를 여러 타입의 객체를 참조할 수 있도록 함으로써, 프로그래밍의 효율을 높임
	  상위 클래스 타입의 참조변수로 하위 클래스의 인스턴스를 참조할 수 있도록 한 것
	  (상속관계)에서 -> 상위 클래스 카입의 참조변수로 하위 클래스의 인스턴스를 참조하도록 하는 것이 가능
	  
	(참조변수)의 형 변환
	: 서로 상속관계에 있는 클래스 사이에서만 가능
	  자손타입의 참조변수를 조상타입의 참조변수로
	  조상타입의 참조변수를 자손타입의 참조변수로 변환 가능
	  조상의 조상으로도 사능함 => 다라서, 모든 참조변수는 모든 클래스의 조상인 Object클래스로 형 변환 가능
 */

//상위
class Car {
	String color;
	int door;

	void drive() {
		System.out.println("운전하다");
	}

	void stop() {
		System.out.println("멈추다!");
	}
}

//하위
class FireCar extends Car {
	void fire() {
		System.out.println("물 분사!!");
	}
}

public class PolyMorphism05 {
	public static void main(String[] args) {
		
		Car car = null;
		System.out.println(car);
		
		FireCar fc = new FireCar();
		fc.fire();
		FireCar fc2 = new FireCar();
		
		// 자식타입을 부모타입으로 형변환 = 묵시적 형변환
		car = fc;
		// car.fire() -> 에러발생

		// 부모타입을 자식으로 형변환
		fc2 = (FireCar) car; // 캐스팅
		fc2.fire(); // 자식 타입으로 형변환 되었으므로 자식클래스의 멤버 사용가능

	}// /main
}

