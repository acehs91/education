package lamda17;
/*
	# 람다함수 = 익명함수를 의미
	: 자바 8 부터 함수적 프로그래밍을 위해 람다식 지원
	= 익명함수를 생성하기 위한 식
	= 자바는 람다식을 함수적 인터페이스의 익명 '구현객체'로 취급 => 기능을 가진 객체로 쉽게 생각하면 됨
	
	# 자바에서 람다식을 수용한 이유
	= 코드가 간결
	= 컬렉션 요소(대용량 데이터의)의 사용이 용이함
*/

public class Lamda01Basic {
    public static void main(String[] args) {
    	
    	
    	FunctionInterface1 fi;   //FunctionInterface1 인터페이스를  fi 에 대입
        fi = () -> {             // fi 을 람다식 호출 
            String str = "인터페이스 추상메서드 구현1";
            System.out.println(str);
        };

        fi.method();
        //FunctionInterface1 안에 method() 호출 이라고 이름을 변경하면 call 함수를 불러야함
        
        // (형식) = 매개변수가 없다면 괄호 생략 불가
        fi = () -> { System.out.println("인터페이스 추상 메서드 구현2"); };
        fi.method();
        
        // (형식) = 하나의 실행문만 있다면 중괄호{} 생략 가능
        fi = () -> System.out.println("인터페이스 추가 메서드 구현3");
        fi.method();
        
    }
}
