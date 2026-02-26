package oop02;

/*
   상속(Inheritance) = 자바는 단일 상속만 허용 (즉, 부모는 하나)
     : 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것
       코드의 추가 및 변경이 용이함
       코드의 재사용성을 높이고 중복 코드를 제거, 프로그램의 생산성과 유지보수에 크게 기여
       예약어) extends
       상속해주는 클래스 = 부모, 상위 클래스
       상속받는 클래스 = 자식, 하위 클래스
       parent <- child
       
   모든 클래스의 조상 = Object 클래스
     => 컴파일시 자동으로 extends Object 가 추가(명시적 코딩 안햇을때)
     => 계속 상위로 올라가다 보면 어딘가에 Object 상속됨으로 자식 클래스는 Object 클래스를 상속받게 되는 것
     
   자식 클래스 = 하위 클래스
   : 부모 클래스의 모든 멥버변수, 메서드를 상속받음
     단, 생성자는 상속되지 않음
   
 */
/* 상속 = 부모 클래스 */
class Tv {
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

/* 상속 받음 = 자식 클래스 */
class SmartTv extends Tv {
	boolean caption;

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

public class Inheritance01 {
	public static void main(String[] args) {
		SmartTv myTv = new SmartTv();
		myTv.channel = 10;
		myTv.channelUp();
		System.out.println("Tv 채널번호 : " + myTv.channel);
		// 자식 메서드
		myTv.displayCaption("Carpe Diem");
		myTv.caption = true;
		myTv.displayCaption("자막출력 : Carpe Diem");

	}// /main
}
