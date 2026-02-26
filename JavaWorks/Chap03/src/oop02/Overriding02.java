package oop02;
/*
   오버라이딩(overriding) = ~위에 덮어쓰다
   : 상위클래스로 부터 '상속'받는 메서드의 내용을 재정의 하는것
     = 메서드 내용만 재정의 하는것임
     
   오버라이딩 조건
   : 메서드 선언부(메서드이름, 매개변수, 반환타입)는 상위클래스의 것과 완전히 일치해야 함
     접근제어자, 예외는 제한된 조건하에서만 다르게 변경 가능
     a. 접근제어자 = 상위클래스의 메서드보다 넓은 범위로 변경 가능
                  (예)상위클래스 메서드 protected -> 하위클래스 메서드 = protected나 public이어야 함
                  private(클래스내) < default(패키지내) < protected(패키지내 상속) < public(어디서나)
                  
   오버로딩 VS 오버라이딩
    a. 오버로딩 = 기존에 없는 새로운 메서드를 추가
    b. 오버라이딩 = 상위클래스에서 상속받은 메서드의 내용을 변경(메서드 재정의)
*/
/* 상위 클래스 */
class Line {
   int x;
   int y;
   String getLocation() {
      return "x : " + x + ", y : " + y;
   }
}
/* 하위 클래스 */
class Line3D extends Line {
   int z;
   // 메서드 오버라이딩 = 기본기능은 사용, 추가멤버 z값 출력
   @Override
   String getLocation() {
      return "x : " + x + ", y : " + y + ", z : " + z;
   }
   
}
public class Overriding02 {

   public static void main(String[] args) {
      // 상위 클래스 생성
      Line l = new Line();
      l.x = 10;
      l.y = 20;
      String result = l.getLocation();
      System.out.println(result);
      // 하위 클래스 생성
      Line3D l3 = new Line3D();
      l3.x = 100;
      l3.y = 200;
      l3.z = 300;
      String result2 = l3.getLocation();
      System.out.println(result2);

   }

}
