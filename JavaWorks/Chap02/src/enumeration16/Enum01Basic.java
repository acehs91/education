package enumeration16;

import java.util.Calendar;

/*
Enumeration 열거타입
: 한정된 값만을 갖는 데이터 타입
  한정된 값은 열거 상수(Enumeration Constant)로 정의
  쉽게 말해서, “선택지가 정해져 있는 값들을 안전하게 표현하기 위한 특별한 자료형”
*/

/*
  (참고) Calendar
  = 추가 클래스로 직접 객체를 생성할 수 없고, 메서드를 통해 구현된 클래스에서 인스턴스를 얻어야 함
  = Date 클래스를 개선한 클래스
*/
public class Enum01Basic {
	public static void main(String[] args) {
		
		Week today = null;

		Calendar cal = Calendar.getInstance();    //싱글톤 패턴 Calendar 객체 생성
		int week = cal.get(Calendar.DAY_OF_WEEK); // 요일 가져옴. 1~7리턴

		System.out.println(week); //5
		
		// switch 이용
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNEDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		 
        System.out.println("오늘의 요일은 " + today );
        
        // 찾아보니 week == 6 || week == 7 으로도  주말 표현 가능함
        if (today == Week.SATURDAY || today == Week.SUNDAY) {
            System.out.println("주말이네요! 쉬는 날입니다 😎");
        } else {
            System.out.println("평일이네요! 힘내세요 💪");
        }
        

	}

}
