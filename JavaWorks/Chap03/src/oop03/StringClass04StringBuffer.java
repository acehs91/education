package oop03;

/*
	StringBuffer 클래스(mutable)
	: 지정된 문자열 변경 가능
	  내부적으로 문자열 편집을 위한 버퍼를 가지고 있고, 인스턴스 생성시 그 크기를 지정할 수 있음
	  
	  버퍼의 길이를 충분히 설정해 주는 것이 좋음
	  -> 버퍼 길이가 넘치면 추가로 버퍼 길이를 늘려주는 작업이 필요하고, 작업효율이 떨어짐

	(참고) StringBuilder 클래스
	: StringBuffer와 사용법이 거의 비슷
	  멀티쓰레드에 안전하도록 동기화가 되어 있음, 즉, 쓰레드 관련 동기화만 뺀 것이 StringBuffer임
 */
public class StringClass04StringBuffer {
	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("abc");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println(sb2);

		// 주소값 비교
		System.out.println("주소값 비교 : " + (sb1 == sb2));
		// 내용 비교 StringBuffer엔 equals가 오버라이딩 안 되어 있음
		System.out.println("내용 비교 : " + sb1.equals(sb2));

		// 문자열 내용 비교를 위해 String타입으로 형변환
		String str1 = String.valueOf(sb1);
		String str2 = String.valueOf(sb2);
		System.out.println("문자열로 변환 후 내용 비교 : " + str1.equals(str2));
	}// /main
}
