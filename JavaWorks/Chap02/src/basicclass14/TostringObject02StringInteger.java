package basicclass14;
/*
 [String, Integer의 toString메서드]
  : String, Integer 클래스에는 toString()이 이미 오버라이딩 되어 있어, 참조주소명이 나오지않는것이다.
  => 해당 문자열과 숫자가 출력
*/
public class TostringObject02StringInteger {
	
	public static void main(String[] args) {
		
		String str = new String("Hello");
		System.out.println("String 클래스로 생성시 자동으로 문자열 출력 " + str.toString());
		
		Integer itg = new Integer(1000);
		System.out.println("Integer 클래스로 생성시 자동으로 숫자형 출력 " + itg.toString());
		
		String str2 = new String("Hello2");
		System.out.println(str2);
	}

}
