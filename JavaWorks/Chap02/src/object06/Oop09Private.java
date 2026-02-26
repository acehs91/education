package object06;
/*
   정보은닉 = 캡슐화 = 객체지향 프로그램의 중요한 특징
    : 접근제어자 = public, protected, (default), private
      a. public => 멤버변수, 메서드가 외부 클래스에서 접근 가능하므로 누구나 사용가능
      b. protected => 같은 패키지 내부와 (상속)관계의 클래스에서만 접근 가능. 그외 접근 불가
      c. default => 같은 패키지내에서 접근 가능
      d. private => 멤버변수, 메서드가 외부 클래스에서 사용불가, 클래스 안에서만 접근 가능
      (참고) 접근제어자 코딩이 안되어 있으면 (default) => 같은 패키지 안에서만 접근 가능
      
   정보은닉 사용이유
    : 외부에서 접근을 막아, 데이터를 외부에서 바꾸지 못하도록 하기 위해(=데이터 보안을 위해 사용)
    (사용방법) 멤버변수를 private으로 선언
             => setter, getter는 public으로 선언하여 사용          
*/
public class Oop09Private {

   public static void main(String[] args) {
	  //Student.java 에서 Class 가져옴
      Student stdt = new Student();
      //stdt.studentName = "김현수"; // 캡슐화로 직접 접근 불가
      stdt.setStudentName("김현수");
      System.out.println(stdt.getStudentName());
   }

}
