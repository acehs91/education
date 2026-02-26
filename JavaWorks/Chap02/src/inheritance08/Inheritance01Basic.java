package inheritance08;

import inheritance08.vo.*;
/*
  상속
  : 객체지향 프로그래밍의 중요한 특징 중 하나
  객체지향의 장점인 유지보수, 프로그램의 새로운 내용을 추가하는 것이 편리하게 해 주는 기반이 상속임
  
  클래스의 상속
  : 상위 클래스 = 부모 클래스 = Super Class = Base Class
  			  <- 하위 클래스 = 자식 클래스 Sub Class = Divided Class
   상속 관계 화살표 방향에 주의
   B클래스가 A클래스를 상속(받는다) = A클래스의 멤버 변수와 메서드를 사용할 수 있음
   (참고)생성자 상속 제외, 하위 클래스의 멤버는 상위 클래스의 멤버보다 같거나 많다.
   
   공통부분에 상위 클래스에서 관리 | 개별 부분 => 하위 클래스에서 관리
   
   클래스의 상속 문법
   :extends(java는 전부 단일상속) 예약어 사용
   (예) B클래스가 A클래스를 상속 받는다
   	   => A 클래스의 멤버변수와 메서드를 받아 B클래스에서 구현한다는 뜻
   	   => B 클래스의 코딩 분량은 더 많아지고, 구체적인 클래스가 됨
   
   
  (접근제어자)class B extends A {
  	실행문;
  }
  
  상속개념 추가 
  상속 대상 제한 = 부모 클래스의 private 멤버변수, 메소드 제외
  			   부모 

*/


public class Inheritance01Basic {
    public static void main(String[] args) {
        Customer c1 = new Customer(1000, "HSK");
        int p1 = c1.calcPrice(100000);
        System.out.println(c1.showCustomerInfo());

        VIPCustomer v1 = new VIPCustomer(2, "김현수", 1001);
        int p2 = v1.calcPrice(10000);
        System.out.println(v1.showCustomerInfo());
        
        //(가정) 일반회원, VIP 회원이 물품 100만원 짜리를 구매 하였을때
        Customer member = new Customer(100, "김이젠");
        System.out.println("일반회원 구매가격 : "+ member.calcPrice(1000000)+"원 입니다.");
        System.out.println(member.showCustomerInfo());
        
        VIPCustomer vip2 = new VIPCustomer(1,"김쌤", 2000);
        int calResult = vip2.calcPrice(1000000);
        System.out.println("VIP 구매가격 : "+ calResult +"원 입니다.");
        System.out.println(vip2.showCustomerInfo());
        
        
    }
}
