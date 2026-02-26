package oop01;

/* static 메서드, 인스턴스 메서드 */
public class ObjectInstance05StaticMethod {

	public static void main(String[] args) {
		// 클래스 메서드 호출 = 인스턴스 생성없이 호출 가능
		System.out.println(MyMath2.add(200, 200));
		System.out.println(MyMath2.substract(200, 200));
		System.out.println(MyMath2.multiply(200, 200));
		System.out.println(MyMath2.divide(200, 200));
		System.out.println();
		// 인스턴스 메서드
		MyMath2 mm2 = new MyMath2();
		mm2.a = 200;
		mm2.b = 100;
		System.out.println(mm2.add());
		System.out.println(mm2.substract());
		System.out.println(mm2.multiply());
		System.out.println(mm2.divide());
	}

}

//내부 클래스
class MyMath2 {
	long a, b;

	long add() {
		return a + b;
	};

	long substract() {
		return a - b;
	};

	long multiply() {
		return a * b;
	};

	double divide() {
		return a / b;
	};

// static 메서드
	static long add(long a, long b) {
		return a + b;
	};

	static long substract(long a, long b) {
		return a - b;
	};

	static long multiply(long a, long b) {
		return a * b;
	};

	static double divide(long a, long b) {
		return a / b;
	};
}