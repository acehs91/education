package basicclass14;

public class Equals02StringInteger {
	public static void main(String[] args) {
	
		// equals()는 “두 객체가 ‘논리적으로 같은 값’을 가지고 있는지 확인하는 메서드”
		
		String str1 = new String("abc");
		String str2 = new String("abc");

		//두 인스턴스 주솟값을 비교하여 결과를 출력
		System.out.println((str1 == str2));                        //false
		System.out.println( "equals사용  : "  + str1.equals(str2)); // true

		/*
			false = str1, str2 가 서로 다른 객체 (다른 메모리 주소)
			equals true 는 두 객체 안의 내용 "abc" 가 같다는 내용
		*/		
		
		System.out.println( "=====================================");
		
		//int → 기본 자료형(Primitive Type)
		//Integer(정수) -> 클래스(Wrapper Class, 즉 “감싸는 객체”)
		Integer int1 = new Integer(100);
		Integer int2 = new Integer(100);
		 
		System.out.println(int1 == int2);
		System.out.println( "equals사용  : "  + int1.equals(int2));
		 
	 }

}
