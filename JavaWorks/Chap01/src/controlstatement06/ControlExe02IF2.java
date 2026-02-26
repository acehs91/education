package controlstatement06;

import java.util.Scanner;

/*
(조건) 정수형 동적데이터 3개 중 하나를 입력(국어, 영어, 수학점수)받아, 
입력받은 데이터가 3과목 평균 80점 이상이고, 각각 점수가 60점 이상이면
"시험통과" 그렇지 않으면 "재시험" 출력
(콘솔) "시험통과", "재시험"

핵심 : avg = (kor + eng + math) / 3; (kor >= 60 && eng >= 60 && math >= 60);
*/

public class ControlExe02IF2 {
    public static void main(String[] args) {    

        Scanner scan = new Scanner(System.in); 

        System.out.println("국어점수는?");  
        int kor = scan.nextInt();     
        System.out.println("영어점수는?");
        int eng = scan.nextInt();     
        System.out.println("수학점수는?");
        int math = scan.nextInt();    
        
        //평균 =  계산 과목 갯수
        int avg = (kor + eng + math) / 3;
        
        // 모든 과목 60 이상
        boolean result = (kor >= 60 && eng >= 60 && math >= 60);
        
        // 조건 >= 3과목 평균 80 이상 
        if (avg >= 80 && result) {
            System.out.println("시험통과!");
        } else {
            System.out.println("재시험!");
        }
    }
}
