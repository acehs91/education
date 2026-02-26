package oop01;

/*
   오버로딩(Overloading)
   : 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메서드가 있더라도,
     매개변수의 갯수 또는 타입이 다르면, 같은 이름의 메서드를 사용해서 정의 가능
     한 클래스 내에 같은 이름의 메서드를 여러개 정의하는 것
     
   오버로딩 조건
    a. 메서드 이름이 같아야 함
    b. 매개변수의 갯수 또는 타입이 달라야 함
*/
public class Overload06 {
	public static void main(String[] args) {
		MyMath3 mm3 = new MyMath3();
		System.out.println(mm3.add(3, 3));
		System.out.println(mm3.add(3L, 3));
		System.out.println(mm3.add(3, 3L));
		System.out.println(mm3.add(3L, 3L));
	}

}

/* 내부 클래스 */
class MyMath3 {
	// 메서드 오버로드 => 매개변수 갯수, 타입이 다 다름
	int add(int a, int b) {
		System.out.println("add(int a + int b) => ");
		return a + b;
	}

	long add(int a, long b) {
		System.out.println("add(int a + long b) => ");
		return a + b;
	}

	long add(long a, int b) {
		System.out.println("add(long a + int b) => ");
		return a + b;
	}

	long add(long a, long b) {
		System.out.println("add(int a + int b) => ");
		return a + b;
	}

}
