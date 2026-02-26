package basicclass14;
/*
  코딩 클래스의 toString() 직업 오버라이딩
*/

// 내부 클래스 
class Book1 {
	// 멤버변수
	int bookNum;
	String bookName;

	// 생성자
	public Book1(int bookNum, String bookName) {
		this.bookNum = bookNum;
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return " 책 넘버  = " + bookNum + ", 책이름 = " + bookName + "";
	}

}

public class TostringObject03Class {

	public static void main(String[] args) {

		Book1 book1 = new Book1(1000, "구멍가게의 추억");
		System.out.println(book1);

	}

}
