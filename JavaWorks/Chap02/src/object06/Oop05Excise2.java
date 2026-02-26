package object06;

public class Oop05Excise2 {
	public static void main(String[] args) {
		Jumun jm = new Jumun(20240101,"MCSSAM","2025년 10월 23일","엠씨","MC222211","서울시 성동구 성수동");
		System.out.println("주문 번호 : "+jm.getNum());
		System.out.println("주문 아이디 : "+jm.getId());
		System.out.println("주문 날짜 : "+jm.getDate());
		System.out.println("주문자 이름 : "+jm.getName());
		System.out.println("주문 상품 번호 : "+jm.getSerial());
		System.out.println("배송 주소 : "+jm.getAddress());
	}
}
