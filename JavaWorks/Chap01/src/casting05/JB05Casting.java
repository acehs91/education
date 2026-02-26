package casting05;

public class JB05Casting {

	public static void main(String[] args) {
		
		double f1 = 1.1; //실수
		System.out.println(f1);
		
		double num = 1;
		System.out.println(num);
		// 큰데이터 타입 실수를 작은 데이터 타입 정수에 할당하면 => 예외발생 => 자동변환 안됨
		//int num = 1.1;
		
		// Casting = (약)식 강제변환 / css important 생각하면됨
		int num3 = (int)1.1;
		System.out.println("Casting:" + num3);
		
	}
	
}
