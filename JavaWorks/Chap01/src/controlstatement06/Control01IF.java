package controlstatement06;
/*
  조건문 
  : 프로그램을 특정 '조건'에 맞게 수행 또는 '반복'하도록 제어
  [형식]
  
  if(조건식) { //결괏값 true, false
  
  }
 */

import java.util.Scanner;

public class Control01IF {
	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);  //Scanner 함수 호출
		
		int age = 10;
		System.out.println(age);

		//단일 if문
		if(age >= 7) {
			System.out.println("입학아동");
		}
		if(age < 7) {
			System.out.println("미취학아동");
		}
		
		//if ~ else문
		int childAge = 6;
		
		if(childAge >= 7){ //높거나 같으면 
			System.out.println("초등학교 입학대상");
		}else{
			System.out.println("미취학대상");
		}
		
		//boolean 조건문 연습
		boolean isStudnet  = true;
		
		if(isStudnet) {
			System.out.println("학생");
		}else {
			System.out.println("학생아님");
		}
		
		// num 짝수면 "짝수", 홀수면 "홀수" 출력
		
		System.out.println("숫자를 입력하세요");
		
	    int num = scan.nextInt();               //콘솔 프롬프트에 받은 값 num에 담음 
	    System.out.println("입력한 정수: " + num); // 받은 값 출력 
		if(num%2==0){ 							// 받은 값 if 문 비교 
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
	}
}
