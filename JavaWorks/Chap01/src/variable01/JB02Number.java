package variable01;

/* Number Type */
public class JB02Number {
	public static void main(String[] args) {
		//정수형 int | 범위  -2,147,483,648 ~ 2,147,483,648
		int numFirst = 1;
		//System.out.println(numFirst);
		int numSecond = 2;
		//System.out.println(numSecond);
		int numThird = 3;
		//System.out.println(numThird);
		int numFourth = 4;
		//System.out.println(numFourth);
		
		//연산자 Operator - 복사해서 밑으로 내리기 - ctrl + alt + 방향키 아래
        System.out.println("더하기 연산 : " + (numFirst + numSecond));
        System.out.println("빼기 연산 : " + (numFirst - numSecond));
        System.out.println("곱하기 연산 : " + (numFirst * numSecond)); 
        System.out.println("나누기 연산 : " + (numFourth / numSecond)); 
        System.out.println("나머지 연산 : " + (numFourth % numSecond)); 
		
        //long 자료형 - int보다 정수 표현 범위가 더 넓음 | 범위 : -26 3제곱 ~ 26 3제곱 -1
        long numLong = 123456789L;
        long numLong2 = 1234; 
        System.out.println("Long 자료형 : " + (numLong + numLong2));
        
        //short 자료형 = int보다 정수 표현 범위가 더 좁음 | 범위 : -32,768 ~ 32,768
        short numShort = 30000;
        short numShort2 = 123; 
        System.out.println("Short 자료형 : " + (numShort + numShort2));
        
        //자동형변환
        int inVal = 10;
        double doubleVal = 5.5;
        double reult = inVal + doubleVal;
        System.out.println("자동형변환 => "+ reult);
        
        //수학에 관한 객체 = Math(), floor(버림), ceil(올림)
        //객체는 폴더고 수학에 관련된 중요한것을 그룹화 해놓은것들이 있다.
        System.out.println(Math.PI);
        
        System.out.println("내림 => " + Math.floor(Math.PI));
        System.out.println("올림 => " + Math.ceil(Math.PI));
        
        
	}
}
