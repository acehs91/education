package controlstatement06;

import java.util.Scanner;

public class ControlExe04SwitchCase {
    public static void main(String[] args) {    

    	Scanner scan = new Scanner(System.in); 
        System.out.println("마지막일수 알고 싶은 달 숫자 입력");  
        
        int month = scan.nextInt();
        int day = 0;
        switch (month) {
        	// 알고싶은 달 case 넣고 마지막 일수 넣기
	        case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31; break; 
	        case 4: case 6: case 9: case 11: day = 30; break;
	        case 2: day = 28; break;
	        default : day = 0; System.out.println("1~12 사이의 값을 입력해주세요.");
		}
        System.out.println(month + "월은 " + day + "일까지있습니다.");
        
    }
}
