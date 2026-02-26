package object06;
/*
	Object Cooperation (객체간의 협력)
	: 객체 지향 프로그래밍은 객체간 사용을 안하면 의미가 없음
	  그래서 객체 간 협력으로 프로그래밍을 함
 */
public class Oop100ClassCo {
	public static void main(String[] args) {
		
		// 1. 학생 2명 생성 | 참조변수명 stdtKim,stdtLee => 생성자 규칙에 맞게 생성
		//Student2.java  Student2
		Student2 stdKim = new Student2("KimMS",5000);
		Student2 stdLee = new Student2("LeeGO",10000);
	
		// (콘솔) 할당 출력
		System.out.println(stdKim.getStudentName()+"의 보유 현금은 "+ stdKim.getMoney() +"원 입니다.");
		System.out.println(stdLee.getStudentName()+"의 보유 현금은 "+ stdLee.getMoney() +"원 입니다.");
		System.out.println("=====================================");
		
		// 2-1. (가정) KimMS 학생이 버스번호 100번 버스를 탔다
		//Student2.java  takeBus , showInfo
		Bus bus100 = new Bus(100);
		stdKim.takeBus(bus100);
		stdKim.showInfo();
		bus100.showInfo();
		System.out.println("=====================================");
		
		// 2-2. (가정)LeeGO 학생이 100번 버스를 탔다
		stdLee.takeBus(bus100);
		stdLee.showInfo();
		bus100.showInfo();
		System.out.println("=====================================");
		
		// 3. (가정) 학생이 지하철 2호선을 탔다
		// 참조변수명 subwayGreen
		Subway subwayGreen = new Subway("2");
		stdKim.takeSubway(subwayGreen);
		stdKim.showInfo();
		subwayGreen.showInfo();
		System.out.println("=====================================");
	}// /main
}
