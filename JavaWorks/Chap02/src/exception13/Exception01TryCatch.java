package exception13;
/*
  예외처리 (Exception)
  : 오류 발생시 갑자기 종료되는 것을 막기위해 예외처리 하는 방법을 알려주는것
  
  예외 클래스
    a. 오류 발생 상황
  	 가. 프로그램 코드 작성 중 실수로 발생하는 컴파일 오류(compile error)
  	 나. 실행중인 프로그램이 중지되거나 의도하지 않는 방향으로 동작(runtime error)
  	 
  	b. Java는 비정상적 상황을 최대한 줋이기 위해 다양한 예외처리 방법을 제공
   			=> 프로그램의 비정상적 종료를 방지하기 위하여 
			   예외 상황이 발생시 , 버그 수정 도움을 받을수 있음
			   
	c. 실행오류 (runtime error)
	  가. JVM에서 발생하는 시스템오류(Error)
  	  나. 예외상황(Exception) = 프로그래밍을 통해 제어가능
  	d. 시스템 오류
  	  = 하드웨어적 오류 = 프로그래밍으로 제어 불가능
  	  
  예외 클래스 종류
  : 프로그램에서 처리하는 예외 클래스의 최상위 클래스 = Exception 클래스
  Exception <- IOException(입출력 예외처리) + RuntimeException(실행오류예외처리)
  .. 등등 여러 클래스가 있음
  
  (참고)
  이클립스 개발환경에서 대부분 예외 발생시 컴파일 오류메세지를 보여주지만,RuntimeException 예외는
  예외처리를 안해도 컴파일 오류가 발생하지 않으므로 컴파일러에 의해 체크되지않는 예외로 개발자가 알아서 처리해야함
  
  #예외 처리하기
  = try ~ catch문 => 예외를 처리하는 가장 기본적인 문법
  
*/
	   
public class Exception01TryCatch {
	public static void main(String[] args) {
		//정수형 5개짜리 배열선언
		int[] arr = new int[4];
		try {
			for(int i=0; i<5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("예외처리부분");
			e.printStackTrace(); //에러 상세내용 보기
		}
		// 콘솔창에 catch 한부분과 예외처리부분이 출력되며 안에 상세내용이 나온다.
		System.out.println("for문 종료");

	}
}
