package inheritance08;

import inheritance08.vo.*;

/*
  오버라이딩(Overriding) 상위 클래스로 부터 상속받은 내용을 클래스에 맞게 변경하는 것
  	=> 메서드 재정의
  	
  오버라이딩 조건
  	a. 메서드 선언부가 길어야 함(이름, 메게변수, 리턴타입)
  	b. 접근제어자를 좁은 범위로 변경 불가
  	c. 조상 클래스의 메서드의 예외의 갯수보다 더 많은 예외를 선언할 수 없음
  	
  	다형성 (Polymorphism)
  	: 상위클래스 (=부모클래스)의 참조변수로 하위클래스(=자식클래스)의 객체를 다룰수 있는것.
  	(중요)상위 클래스의 참조변수 = new 하위클래스가 성립하는 것이 다형성임
  	
  	참조변수의 형변환
 	: 서로 상속관계에 있는 참조타입끼리만 형변환 가능
 	- 자식 > 부모 형변환 : 자동(생략 가능)
 	- 부모 > 자식 형변환 : 강제(생략 불가, 명시적 캐스팅 필요)
	Customer c = new VIPCustomer(); // 자식 → 부모 (자동 형변환)
	VIPCustomer v = (VIPCustomer)c; // 부모 → 자식 (강제 캐스팅)
 */
public class MethodOverring {
	public static void main(String[] args) {
		
		
		Customer customerHS = new  Customer(1, "KIM HS");
		//customerID , customerName
		System.out.println(customerHS.showCustomerInfo());
		System.out.println("======================================");
		//일반회원 값 변경
		customerHS.setCustomerID(1);
		customerHS.setCustomerName("KIM HS");
		customerHS.setBonusPoint(100);
	

		//VIPCustomer를 Customer 데이터형으로 생성 => 묵시적 형변환
		
		Customer customerHS2 = new VIPCustomer(10020,"KIM HS2", 12345);
		//System.out.println(customerHS2.showCustomerInfo());
		
		// (가정) 회원이 백만원짜리 물품을 구매했을때, 회원 등급에 따라 다르게 적용
		int productPrice = 1000000;//100만원짜리 물품
		
		
		int calResult = customerHS.calcPrice(productPrice);
	    System.out.println("일반회원님의 물품가격 : "+ calResult +"원 입니다.");
	    //일반회원님의 물품가격 : 1000000원 입니다.
	    
		int calResult2 = customerHS2.calcPrice(productPrice);
	    System.out.println("VIP 물품가격 : "+ calResult2 +"원 입니다.");
	    //VIP 물품가격 : 800000원 입니다.
	    
	 
	    //customerHS 콘솔 출력
	    System.out.println("======================================");
	    System.out.println("일반회원 물품가격 : " + calResult + "원 지불!!");
	    System.out.println(customerHS.showCustomerInfo());
	    
	    System.out.println("======================================");
	    //customerHS2 콘솔 출력
        System.out.println("VIP 물품가격 : " + calResult2 + "원 지불!!");
        System.out.println(customerHS2.showCustomerInfo());
	    

	}
}
