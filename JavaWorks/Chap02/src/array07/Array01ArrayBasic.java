package array07;

import java.util.List; // ✅ List.of() 사용을 위해 반드시 필요!

/*
  배열(Array)
  : 변수 => 료 한개만 저장되는 공간
    배열 => 같은 변수명에 (자료형)이 같은 여러개의 데이터가 저장
		   자료형 = array (배열형)
		   자료구조의 가장 기본이 됨
   [배열 선언 방식]
   자료형[] 배열명 = new 자료형[배열갯수];
   자료형 배열명[] = new 자료형[배열갯수];
   (예시) int형으로 10자리 배열을 메모리에 할당 | 메모리번짓수(index번호) 0부터 시작
   int[] arr = new int [10];
 */

public class Array01ArrayBasic {
	public static void main(String[] args) {
		//int[] arr = new int [10];
		int[] arr = {100,102,103,200};
		//100, 200 출력
		System.out.println(arr[0]);
		System.out.println(arr[3]);
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		//옛날버전
		for (int a = 0; a < num.length; a++) {
		    System.out.println(a);
		}
		
		//enhanced for 버전
		for (int b : num) {
			System.out.println(num);
		}
		
		//enhanced 실무 활용 버전
		List<String> users = List.of("홍길동", "이순신", "강감찬");

		for (String user : users) {
		    System.out.println("이름: " + user);
		}
		
		System.out.println("====for문 배열요소(item)길이만큼 출력====");
		
		
		//버전1
		double[] data = {10.0,10.0,10.0};
		for (double n : data) {
			System.out.println(n);
		}
		
		//버전2
		double[] data2 = new double[5];
		//new double[5]라서 3개까지 잘 불러오고 나머지는 2개 배열은0.0으로나옴
		data2[0] = 20.0;
		data2[1] = 21.0;
		data2[2] = 22.0;
		for (double j : data2) {
		    System.out.println(j);
		}
		
		System.out.println("====for문 배열요소(item)길이만큼 출력====");
		
		// 기본 배열 실습
	    // 정수형 데이터 7개를 만든후 배열에 할당하세요. 값 한번에 할당
	    // 배열 아이템을 모두 출력해주세요
	    // 캡쳐, 넘버링
		
		//버전3
		int [] data3 = {2,3432,23,451,3532,35633};
		for (int k : data3) {
			System.out.println("실습배열 출력 : " + k);
		}
		
	}
}
