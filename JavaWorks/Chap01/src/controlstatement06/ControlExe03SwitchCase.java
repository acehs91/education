package controlstatement06;

import java.util.Scanner;

public class ControlExe03SwitchCase {
    public static void main(String[] args) {    
/*
    	Switch문 실습1.
    	(조건) 정수형 동적데이터 1개를 입력받아, 
    	입력받은 데이터 홀수이면 홀수입니다., 짝수이면, 짝수입니다. 
    	출력
    	(콘솔) "홀수","짝수"
    	(결과) 캡쳐 넘버링
    	핵심 : num % 2 
*/

    	Scanner scan = new Scanner(System.in); 
        System.out.println("숫자입력받기"); 
        
        int num = scan.nextInt();
        
        switch (num % 2) {
	        case 0: System.out.println("짝수입니다."); break;
	        case 1: System.out.println("홀수입니다."); break;
		}
        
        
/*
	    Switch문 실습2.
	    (조건) 문자형 동적데이터 3개 중 1개를 입력받아, 
	    입력받은 데이터(서울,경기도,부산) (서울,경기도,부산)이면 지역번호가 ???입니다. 서울=02, 경기도=031, 부산=051
	    (콘솔) ???의 지역번호는 ???입니다.
	    (결과) 넘버링
	    핵심 : areaCode ="00";
*/
        
    	System.out.print("지역명을 입력");
	    String city = scan.next();
	    String areaCode ="00";
	    
        switch (city) {
	        case "서울": areaCode = "02"; break;
	        case "경기도": areaCode = "031"; break;
	        case "부산": areaCode = "051"; break;
	        default: System.out.println("다시입력");
		}
        
        System.out.println(city + "의 지역번호는 " + areaCode + "입니다.");
    }
}
