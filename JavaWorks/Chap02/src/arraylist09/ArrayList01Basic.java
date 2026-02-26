package arraylist09;
import java.util.ArrayList;
/*
 기존 배열의 단점
 : 기본적으로 배열 길이를 정하고 시작
 하지만, 배열 ㄷ ㅔ이터가 달라지면 코드를 수정해야 하는 불편함이 있음
 그래서, 자바배열을 좀더 쉽게 사용할 수 있도록 '객체배열'인 ArrayList 제공
 객체 배열
 
 ArrayList 객체 
 : 객체 배열을 관리할 수 있는 멤버변수와 메서드를 제공
   사용 방법만 알면 편리하게 사용이 가능
   java.utill 소속 => 자료구조와 알고리즘에 관련된 클래스를 구현해 놓은 패키지
 
 ArrayList 사용법
 : 어떤 자료형의 객체를 사용할지 컴퓨터에 알려줘야 함 => *제네릭을 사용함
   import해서 사용
   
 *제네릭이란 ?
*/

public class ArrayList01Basic {
    public static void main(String[] args) {
    	
        // ArrayList 객체 생성 = new (제네릭 타입은 <Book>)
        ArrayList<Book> lib = new ArrayList<Book>();
        
        // Book 객체 생성 및 추가
        lib.add(new Book("싱아는 누가 먹었냐?", "박완서"));
        lib.add(new Book("상실의 시대", "하루키"));
        lib.add(new Book("붉은돼지", "하야오"));
        lib.add(new Book("거꾸로 읽는 세계사", "유시민"));
        lib.add(new Book("정의란 무엇인가", "샌더스"));

        //ArrayList는 length가 아닌 → size() 메서드를 사용
        // for (int i = 0; i < lib.size(); i++) {
		//    lib.get(i).showBookInfo();
		// }
        
        // 저장된 도서 정보 for 출력
        for (Book book : lib) {
          book.showBookInfo();
    	}
    }
}