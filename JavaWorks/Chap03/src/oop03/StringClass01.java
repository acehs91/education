package oop03;

/*
	String 클래스
	: 자바에서 문자열을 위한 클래스 제공
	  문자열을 저장하고 이를 다루는데 필요한 메서드를 함께 제공
	  
	변경 불가능한(Immutable) 클래스
	: 문자열 저장을 위한 문자열 배열 참조변수(char[])의 value를 인스턴스 변수에 저장
	  (참조) String클래스는 final이 붙어있으므로 다른 클래스의 조상이 될수 없음
	  
	  한 번 생성된 String 인스턴스가 갖고 있는 문자열 = 읽어 올 수만 있고, 변경을 불가
	  예) String a = "a"; String b = "b"; a = a+b;
	     => + 연산자 사용 문자열 결합시 인스턴스내 문자열이 바뀌는 것이 아니라, 새로운 문자열이 String 인스턴스에 생성
	     => 인스턴스가 계속 생성되어 메모리 공간을 많이 차지
	       => 문자열 다루는 작업이 많이 필요한 경우 'StringBuffer 클래스'를 사용하는 것이 좋음
	  
	  문자열을 만들 때 2가지 방법
	    ㄱ. 생성자 이용 new 연산자에 의해 메모리 할당 => 항상 새로운 인스턴스가 생성
	    ㄴ. 바로 문자열 할당시 문자열 리터럴이 되므로 => 존재하는 것을 재사용
 */
public class StringClass01 {

	public static void main(String[] args) {
		// 문자열 리터럴
		String str1 = "abc";
		String str2 = "abc";
		// 같은 문자리터럴 내용이므로 같은 메모리 주소번지 가르킴
		System.out.println("주소 번지 비교 : " + (str1 == str2));
		// 문자열 내용 비교
		System.out.println("문자열 내용 비교 : " + str1.equals(str2));

		// 인스턴스 생성
		String str3 = new String("abc");
		String str4 = new String("abc");

		System.out.println("인스턴스 주소번지 비교 : " + (str3 == str4));
		System.out.println("인스턴스 내용 비교 : " + str3.equals(str4));
	}

}
