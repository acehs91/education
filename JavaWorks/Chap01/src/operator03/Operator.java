package operator03;


public class Operator {
	public static void main(String[] agrs) {
	
		int mathscore = 90;
		int engscore = 100;
		
		System.out.println("수학점수는??? " + mathscore +  " 영어점수는??? " + engscore);
		
		int totalScore = mathscore + engscore;
		System.out.println("두 과목의 총점은" + totalScore +"점");
		
		//실습 두 과목 평균 구하기. (콘솔)평점은 ??? 입니다. 단, 평점의 결괏값은 95.0
		// 평균 = AVG
		double avgScore = totalScore/2; //나머지2 
		System.out.println("두 과목의 총점은" + avgScore +"점");
		
		/* 증감연산자 = 단항 연산자 */
		int gameScore =  150;
		int gameScore2 =  200;
		int gameScore3 =  100;
		System.out.println(gameScore);
		
		// 증가연산자(결괏값이 바로적용) 전위형, 후위형 차이점 비교
		
		int plusScore = ++gameScore;
		System.out.println("증감연산자(전위) "+plusScore); //계산끝난 값을 출력 151
		
		int plusScore2 = gameScore2++;
		System.out.println("증감연산자(후위) " + plusScore2); //계산하기 전 값을 출력 200
		
		/* 비교연산자 = 이항 연산자 => 결괏값이 true, false만 나옴 */
		// myAge의 상태를 콘솔에 출력 | 비교값은 40
		int myAge = 30;
		boolean tf = myAge > 40; 
		System.out.println("비교연산자 값: " + tf);
		
		//비교연산자 정리
		int num1 = 5;
		int num2 = 3;
		boolean val = (num1 > num2);
		System.out.println("맞니? " + val);
		System.out.println("크거나 같니? " + (num1 >= num2));
		System.out.println("크거나 같니? " + (num1 <= num2));
		System.out.println("같니? " + (num1 == num2));
		System.out.println("논리부정 " + (num1 != num2) );
		
		/*논리 연산자 = && (논리곱 = 참&&참 => 참) ||(논리합 = 참||거짓 => 참), !(논리부정 = 단항연산자 => 결괏값의 반)*/
		
		int data = 10;
		int i = 2;
		
		boolean value = ((data = data + 10)< 10) && ((i = i + 2) < 10);
		// value 값 연산중 커서 위치가 앞쪽이 false라서 뒤쪽은 계산없이 바로 return false 출력
		boolean value2 = ((data = data + 10) > 10) || ((i = i + 2) < 10);
		// value2 값은 연산중 커서 위치가 앞쪽이 true 라서 뒤쪽은 계산없이 바로 return true 출력
		
		/*논리곱*/
		System.out.println("논리곱 && " + value); //false
		/*논리 합*/
		System.out.println("논리 합 || " + value2); // true
		/*논리 부정*/
		System.out.println("논리 부정 ! " + !(value2)); // false

		/* 복합대입연산자 =(는)과 조합하여 연산자를 사용, 데이터 누적 => +,-,*,/,% */
		
		int com1 = 5;
		int com2 = 5;
		com1 +=5; // com1 = com1 +5;
		System.out.println("복합대입연산자 " + com1);
		
		/*삼항조건연산자*/
		int age1 = 32;
		int age2 = 27;
		
		// (콘솔) 비교연산자 age1이 더 클경우 출력
		System.out.println( age1 > age2 ? "첫번째 변수값이 큼!!" : "두번째 변수값이 큼!!");
						  // A > B (조건)? (비교) "결과값" : "결과값2"
		
		//char 데이터형 : 문자 1개를 저장하는 자료형
		char ch;
		ch = (age1 > age2) ? 'M' : 'F';
		System.out.println("성별기호는 " + ch);
		
	}
}
