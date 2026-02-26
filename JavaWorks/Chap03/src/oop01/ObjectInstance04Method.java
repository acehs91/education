package oop01;

/*
 메서드 예제
 : 사칙연산을 메서드로 정의하고 호출하기
*/
public class ObjectInstance04Method {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;

		System.out.println("add는 (" + a + " + " + b + ") => " + add(a, b));
		System.out.println("subtract는 (" + a + " - " + b + ") => " + subtract(a, b));
		System.out.println("multiply는 (" + a + " * " + b + ") => " + multiply(a, b));
		System.out.println("divide는 (" + a + " / " + b + ") => " + divide(a, b));
	}

	// 더하기
	static int add(int x, int y) {
		return x + y;
	}

	// 빼기
	static int subtract(int x, int y) {
		return x - y;
	}

	// 곱하기
	static int multiply(int x, int y) {
		return x * y;
	}

	// 나누기
	static int divide(int x, int y) {
		return x / y;
	}
}
