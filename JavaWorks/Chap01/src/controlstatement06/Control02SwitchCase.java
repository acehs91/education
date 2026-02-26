package controlstatement06;
/*
  switch~case문 : 조건이 여러개 일때 사용
  [형식]
  
  switch(조건식) { 
  	case 조건값1: 실행문1;
  				break;
  	case 조건값2: 실행문2;
  				break;
	...
	defalut : 조건값에 값이 없는경우 기본문 실행; 생략가능
  }
 */

import java.util.Scanner;

public class Control02SwitchCase {
	public static void main(String[] args) {	
		
		
		int rank =1;
		char medalColor = 'A';
		
		switch (rank) {
		case 1: medalColor = 'G';
							break;
		case 2: medalColor = 'S';
							break;
		case 3: medalColor = 'B';
							break;
		}
		
		System.out.println(rank + "등 메달의 색깔은" + medalColor + "입니다.");
		
		// switch문 실습
		// (변수명)medal (변수값)Gold,Silver,Bronze 셋중에 하나
		// (조건)만약 medal이 Gold,Silver,Bronze이면, (콘솔)금메달 입니다.은메달 입니다.동메달 입니다.
		// 변수값에 맞는 문자열이 없으면 노메달
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("받은 메달을 입력하세요."); // 안내문
		String medal = scan.next();				// 문자열 입력받기
		String result; 							// 결과를 담을 변수

		// switch문으로 분기처리 
		switch (medal) {
		    case "금메달": result = "Gold"; break; // 입력받은 값이 금메달시 Gold 뱉음
		    case "은메달": result = "Silver"; break; // 입력받은 값이 은메달시 Silver 뱉음
		    case "동메달": result = "Bronze"; break; // 입력받은 값이 동메달시 Bronze 뱉음
		    default: result = "노메달";
		}
		// 한줄 요약 : case로 분기 결과를 받아 > result 로 뱉음
		
		System.out.println("받은 메달은 " + result + "입니다."); //결과 출력
		
		
	}
}
