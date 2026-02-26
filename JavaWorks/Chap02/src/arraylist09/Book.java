package arraylist09;

public class Book {
	
	//변수
    private String bookName;
    private String author;

    //생성자
    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    // get & set
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

    // 메서드: 책 정보 콘솔 출력
    public void showBookInfo() {
        System.out.println("책 제목 : "+bookName + ", " + author);
    }
}
