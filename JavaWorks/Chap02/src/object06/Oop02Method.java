package object06;
/*
 메서드 : 클래스 기능을 구현
  		하나의 (기능)을 수행하는 코드 | 메서드명, 입력값(=매게변수값), 리턴 값()을 가짐
 [형식1] = 반환값이 있는것
 public[=접근제어자] int[=반환형=리턴타입 add[=메서드명](int num1, int num2[=매게변수]){
 
	실행코드 1;
	실행코드 2;
	
	int result;
	result = num1 + num2';
	
	return result;
 }
	
 [형식2] = 반환값이 없는것 => 예약어 리턴타입 void
 public[=접근제어자] int[=반환형=리턴타입 add[=메서드명](int num1, int num2[=매게변수]){

	실행코드 1;
	실행코드 2;
	
	sysoutSystem.out.println(studentName + "님 안녕하세요~~");
	
	return; // 반환데이터값이 없는것
 }
 
*/
public class Oop02Method {
	public static void main(String[] args) {
		
		// 변수
		int num1 = 100;
		int num2 = 80;
		System.out.println(num1+"+"+num2 +"=" + add(num1,num2)+"입니다.");
		//add 함수 호출 
	}
	
	//리턴 값이 있는 add 메서드 ※실무에 사용할일없지만 보기위한 예시로 만듬
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

}
