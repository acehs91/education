package array07;
/*
 객체 배열 사용
 : 기본 자료형 배열과 사용방법이 조금 다름
*/
public class Array03ArrayObject {
	public static void main(String[] args) {
		
		// 새로운책을 쓸꺼야
        Book book1 = new Book();
        
        // 네이밍
        book1.setBookName("개미"); 
        book1.setAuthor("김현수");
        book1.showBookInfo();
        
        // lib 참조변수명 | 데이터타입 = Book | 배열로 5자리 할당
        Book[] lib = new Book[5];
        lib[0] = new Book("상실의 시대", "하루키");
        lib[1] = new Book("데미안", "헷세");
        lib[2] = new Book("슬램덩크", "이노우에");
        lib[3] = new Book("구멍가게", "이미옥");
        lib[4] = new Book("어린 왕자", "쥐베리");
		
    	// for문 - 책 출력 메서드를 호출 
        for (int i = 0; i < lib.length; i++) {
            lib[i].showBookInfo();   
        }
        
        //같은 결과 향상 for문
        for(Book book2 : lib) { //변수 
        	book2.showBookInfo();
        }
/*
	향상 for문
	: 배열 요소값을 순서대로 하나씩 가져와서 변수에 대입
	  무조건 모든 배열의 시작 아이템부터 끝 아이템까지 반복
	  (형식) for(결과받을 변수:배열명){
	  	실행문;
	  }
*/
        // 배열을 만드세요 | 배열명 strArray 
        // 배열데이터 "Java", "JSP", "C", "JavaScript", "Python";
        String[] strArray = {"Java", "JSP", "C", "JavaScript", "Python"};
        for (String lang : strArray) {
            System.out.println(lang);
        }
	}
}
