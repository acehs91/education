package object06;
/*
생성자(Constructor)
: 클래스를 생성할때만 호출, 생성자 이름은 클래스 이름과 같고, 반환 값은 없음
(주된기능) 생성과 동시에 멤버변수의 초깃값 세팅이 가능
  
a. 디폴트 생성자
: 생성자 없는 클래스는 컴파일시 자동으로 자바 컴파일러가 만들어 줌
  생성자명 = 클래스명과 동일
  
b. 생성자 만들기
: 매게변수의 값으로 클래스 생성시 초기화 해주고 싶은 멤버변수를 코딩해 줌

*/
public class Oop06Constructor {
    public static void main(String[] args) {

        Person per = new Person("최홍만", 218, 120, 'M', false);
    	
        // Getter로 콘솔 출력
        System.out.println("이름: " + per.getName());
        System.out.println("키: " + per.getHeight() + "cm");
        System.out.println("몸무게: " + per.getWeight() + "kg");
        System.out.println("성별: " + per.getGender());
        System.out.println("결혼 여부: " + (per.getMarried() ? "기혼" : "미혼"));
    }
}
