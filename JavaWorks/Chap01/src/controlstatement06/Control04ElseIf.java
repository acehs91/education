package controlstatement06;

import java.util.Scanner;

public class Control04ElseIf {
    public static void main(String[] args) {    
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("시험점수를 입력하세요."); // 안내문
        int score = scan.nextInt();            //입력 받을 점수     
        
        if( score >= 90){
        	System.out.println("A");
        }else if(score >= 80){
        	System.out.println("B");
        }else if(score >= 70){
        	System.out.println("C");
        }else if(score >= 60){
        	System.out.println("D");
        }else{
        	System.out.println("F");
        }
        
    }
}
