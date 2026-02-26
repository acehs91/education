package oop01;
/*
객체지향 언어
: 코드의 재사용성, 코드 관리 용이, 신뢰성 높은 프로그래밍
  상속, 다향성, 재사용성, 유지보수, 중복된 코드 제거에 용이

클래스와 객체
 a. 클래스 = 객체를 정의
 b. 클래스 용도 = 객체를 생성하여 사용
 
객체 구성 요소
 a. 속성(Property) -> 멤버변수(Variable)
 b. 기능(Function) -> 메서드(method)
 
객체와 인스턴스
: 클래스로부터 객체를 만드는 과정
  = 클래스의 인스턴스화(instantiate) -> 클래스가 객체가 됨(=클래스의 인스턴스)
  
           인스턴스화
    클래스 ------------------> 인스턴스(객체) 
*/

public class ObjectInstance01 {
	public static void main(String[] args) {
		//참조타입 참조변수 선언
		Tv myTv;
		myTv = new Tv();
		//System.out.println(myTv);
		
		//캡슐화안되어있어 직접접근 가능
		myTv.channel = 8;
		myTv.channelDown(); 
		System.out.println("현재 채널은 " + myTv.channel + "번 채널 시청중입니다."); //7
		
		
		myTv.power = true;
		System.out.println("현재 TV는 상태로 " + myTv.power + " 켜져 있습니다."); 
		
		if(myTv.power = false) {
			System.out.println("현재 TV는 상태로 " + myTv.power + " 켜져 있습니다.");
		}else {
			System.out.println("현재 TV는 상태로 " + myTv.power + " 꺼져 있습니다.");	
		}
	}
}

class Tv { //참조타입
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}