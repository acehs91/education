package array07;

public class Book {

	//멤버변수
    private String bookName;
    private String author;
    
    //디폴트 생성자
    public Book() {}
    
    //오버로딩
    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }
    
    //get,set
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
    // 책 정보 출력 메서드
    public void showBookInfo() {
        System.out.println("책 제목: " + bookName + ", 저자: " + author);
    }
}
