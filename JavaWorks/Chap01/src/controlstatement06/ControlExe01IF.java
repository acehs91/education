package controlstatement06;

import java.util.Scanner;

/*
(조건) 정수형 동적데이터 1개를 입력받아, 입력받은 데이터가 19세 이상 45세 미만이면 "서류심사통과" 그렇지 않으면 "서류심사보류" 출력
(콘솔) "서류심사통과","서류심사보류"

핵심 : ((age>=19)&&(age<45))
*/

public class ControlExe01IF {
    public static void main(String[] args) {    
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("나이를 입력하세요.");  // 안내문
        int age = scan.nextInt();             //입력 받을 점수     
        
        if((age>=19)&&(age<45)) {
        	System.out.println("서류심사통과!");
        }else{
        	System.out.println("서류심사보류!");
        }
        
    }
}
