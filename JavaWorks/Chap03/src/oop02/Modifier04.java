package oop02;

/*
	제어자(modifier) = static, final, abstract 등등
	: 클래스, 변수, 메서드이 선언부에 함께 사용, 부가적인 의미를 부여
	  a. static = 클래스의 = 공통적인
	    : 인스턴스 생성하지 않고도 사용 가능
	  b. final = 변경될 수 없는
	    : 변수에 사용하여 상수가 되면= 메서드에 사용하면 => 오버라이딩 할 수 없게 됨
	      클래스에 사용하면 => 상속 자손 클래스를 정의하지 못하게 됨
	  c. abstract = 추상의 => 미완성의
	    : 메서드의 선언부만 작성, 실제 수행내용은 구현하지 않은 추상메서드 선언에 사용
 */
/*
	접근제어자 = 캡슐화
	: 클래스 내부에 선언된 데이터를 보호하기 위해 = 데이터가 유효한 값이 유지되도록 데이터의 외부 접근을 제한하는 것
	  또한, 클래스 내에서만 사용하는 내부 작업을 위해 임시로 사용되는 멤버변수나 부분작업을 처리하기 위한 메서드등을 감추기 위해 사용
	    => private / protected
 */
public class Modifier04 {
	public static void main(String[] args) {
		Time time = new Time();
		time.setHour(9);
		time.setMin(53);
		time.setSec(47);
		System.out.println(time.getHour() + "시 " + time.getMin() + "분 " + time.getSec() + "초");
	}//
}
