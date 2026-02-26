package oop03;

import java.util.StringJoiner;

/* String 클래스 메서드 */
public class StringClass02 {
	public static void main(String[] args) {
		
		String animal = "dog,cat,bear"; //단어3개 
		String[] arr = animal.split(","); // split() = 문자열을 짤라 , 를 구분자로 나눠 arr 배열에 저장
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(String.join("-", arr)); // join() = 배열의 문자열을 "-"로 구분해서 결합
		
		// StringJoiner
		StringJoiner sj = new StringJoiner("/", "[", "]"); // 구분자 /로 배열아이템을 나누어서 []로 묶음
		
		for (String s : arr) {
			sj.add(s);
			System.out.println("StringJoiner1 : " + sj);
		}
		
		System.out.println("StringJoiner2 : " + sj);

	}// /main
}
