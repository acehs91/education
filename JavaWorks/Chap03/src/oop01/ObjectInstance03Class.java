package oop01;
/*
 생성할 때마다 참조주솟값 각각 할당
 = 각 인스턴스의 멤버변수는 다른값을 유지하지만, 메서드 내용은 같은 클래스 생성시 동일함
*/
public class ObjectInstance03Class{
	public static void main(String[] args) {
		
		//기본 사용법
		System.out.println("클래스 statc 변수 => " + Card.width);
		System.out.println("클래스 statc 변수 => " + Card.height);
		System.out.println("=================절취선===============");
		
     	// 인스턴스 생성
     	Card c1 = new Card("Diamond", 1);
        Card c2 = new Card("Spade", 4);
        
        // 인스턴스별 값 출력
        System.out.println("c1 => " + c1.kind + " " + c1.number);
        System.out.println("c2 => " + c2.kind + " " + c2.number);
        System.out.println("=================절취선===============");
        
        c1.showInfo(); //Print 선언
        c2.showInfo(); //Print 선언
		
	}
}

class Card { 
	String kind; //타입
	int number;  //번호	
	
	public static int width = 100;
	public static int height = 250;
	
    // 생성자 추가
    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    
    // Print  추가
    void showInfo() {
        System.out.println(kind + " " + number + " (" + width + " x " + height + ")");
    }
}
