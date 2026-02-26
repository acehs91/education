package oop03;

/*
	문자열과 기본형 간의 변환
	  a. 문자열로 변경하는 방법
	  b. valueOf() 사용
	  c. parseInt(),parseDouble() 등등 각각 기본형 메서드 사용
 */
public class StringClass03 {

	public static void main(String[] args) {
		int i = 100;
		// 문자열로 변경하는 방법
		String str1 = i + "";
		System.out.println(str1);
		double dVal = 100.0;
		String strDval = dVal + "";
		System.out.println(strDval);
		System.out.println(str1 + strDval);

		// valueOf() 사용
		String str2 = String.valueOf(i);
		System.out.println(str2);
		System.out.println();

		int iVal = 100;
		String strVal = String.valueOf(iVal);
		System.out.println(strVal);

		// c. parseDataType()
		double dVal2 = 1000.0;
		String dVal3 = String.valueOf(dVal2);
		System.out.println(dVal3);
		int iVal2 = 1000;
		String str3 = iVal2 + "";

		Double sum = Integer.parseInt(str3) + Double.parseDouble(dVal3);
		System.out.println(sum);
	}
}
