package variable01;

/*
  # 참조타입 데이터형
  	A. 데이터타입 = 기본타입(Primitive Type), 참조타입 (Reference Type)이 있음
  		a. 기본타입 = char, byte, short, int, long, float, double, boolean => 총 8개
  		b. 참조타입 = 클래스(class), 인터페이스(interface), 배열(array), 열거(enum) ...
  	B. 변수의 메모리 사용
  		a. 기본타입 변수 = 실제값을 변수 안에 저장 => 스택(stack)영역
  		b. 참조타입 변수 = 주소를 통해 객체참조(=주솟값 참조) => 힙(Heap)영역
	
	힙(Heap)은 자바에서 객체가 저장되는 메모리 공간
	new로 생성한 모든 객체와 배열은 힙에 저장되고, 스택에는 그 객체를 가리키는 *참조(번지)*만 들어 있어.
	힙은 JVM이 관리하고, 가비지 컬렉터가 더 이상 사용되지 않는 객체를 찾아 메모리를 회수한다.
	
	
	# JVM이 사용하는 메모리 영역
		: OS에서 할당받은 메모리 영역(Runtime Data Area)을 세영역으로 구분
			a. 메소드 영역(Method Area)
				= JVM이 시작될때 생성
			b. (JVM)스택 영역(Staack Area)
				= JVM별 생성
			c. 힙 영역(Heap Area)
				= 주솟값이 가르키고 있는 실제 데이터가 있는 영역
				= JVM이 시작될때 생성
				= 객체/배열들이 저장됨
				= JVM이 사용하지 않는 객체 가비지 컬렉터(GC)가 
				  힙(Heap)에서 이런 객체를 자동으로 찾아 메모리를 회수(제거)
*/

public class JB04ReferenceType {
	public static void main(String[] args) {
		
		//변수명 obj로 할당 = new 생성 함수로 ReferenceData1 복사 
		ReferenceData1 obj = new ReferenceData1();
		
		System.out.println("Ref 변경 전 값: " + obj.getRef()); //100 
		obj.ref = 200; 
		System.out.println("Ref 변경 후 값: " + obj.getRef()); //200
		System.out.println("Str 값: " + obj.getStr()); //참조타입
        
		System.out.println(obj); //new 메모리 번지수 자동부여 - @7637f22 
        //참조주소명을 refData2으로 같은 객체 생성후 메모리 주솟값 출력
        
        ReferenceData1 obj2 = new ReferenceData1();
        System.out.println(obj2); //new 메모리 번지수 자동부여2 - @4926097b
        
        System.out.println(obj == obj2);  // false
	}
}
