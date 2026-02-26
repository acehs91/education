// 패키지 = 폴더로 관리하는 개념 = 리액트와 같음
package hello;
/*
 	JAVA 작동방식 정리
  	: *.java = 사람이 볼수 있는 코드, 저장후 컴파일을 하면 *.class가 만들어짐 (=컴퓨터가 알수 있는 코드)
  	a. HelloWorld.java 코딩
  	b. HelloWorld.class 컴파일
  	c. JVM(JavaVirtualMachine)이 해석 => JDK 설치시 생김
  	d. JVM이 해석시(*.class) 오류가 없으면 결과 출력
     
    #JVM = a. HelloWorld.java와 같은 이름의 HelloWorld.class 파일을 찾아
     	   b. (무조건) main메서드를 찾아 첫번째로 실행시키도록 약속이 되어 있음
     	   c. 자바의 Entry Point(시작점) => main() 메서드 하나 있다. // 마치 react app()처럼
     		 
    JAVA 작동 원리 
    자바 소스(*.java) -> javac로 컴파일 -> 바이트코드(*.class) -> Java로 실행
    => JVM이 바이트코드를 해석해서 운영체제에서 실행
    
    JVM 기반 = java는 JAVM에서 실행 => 하드웨어/OS로부터 독립적
    오픈 = 풍부한 라이브러리로 프레임워크로 확장성이 뛰어남
    보안성 안정성 = 강력한 타입
       
/*
static(정적) <=> dynamic (동적) 
main() 메서드 Entry Point 시작점이라 static이 붙는다.

함수명 메인 (데이터타입 정의 무조건 해야함 agrs){

}
*/
public class HelloWorld {  
	public static void main(String[] args){
		System.out.println("Hello World");
	}
}































