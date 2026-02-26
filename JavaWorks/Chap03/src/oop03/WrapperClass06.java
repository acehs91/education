package oop03;

/*
	래퍼(Wrapper) 클래스
 */
public class WrapperClass06 {
	public static void main(String[] args) {

		Integer i = new Integer("100"); // 숫자
		Integer i2 = new Integer(200); // 문자
		System.out.println(i2);

		// 주솟값 비교
		System.out.println("i == i2 ? " + (i == 12)); // false
		// 값비교
		System.out.println("i == i2 ? " + i.equals(i2)); // false
		// 값출력
		System.out.println(i.toString()); // false
		// 비교하여 같으면 0, 크면 1, 작으면 -1 리턴
		System.out.println("compareTo() 비교연산 => " + i.compareTo(i2)); // -1
	}

}
