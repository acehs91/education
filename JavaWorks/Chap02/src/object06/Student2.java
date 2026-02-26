package object06;

public class Student2 {
	// 멤버변수
	String studentName; //학생 이름
	int money; // 학생 현금
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public Student2() {}
	public Student2(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	// 메서드1 = 학생이 버스를 탄다
	public void takeBus(Bus bus) {
		bus.busTake(1000);
		// 학생 입장에서 money -1000원
		this.money-=1000;
	}
	// 메서드 2 = 학생이 지하철을 탄다
	public void takeSubway(Subway sub) {
		sub.subTake(1500);
		this.money-=1500;
	}
	
	// 메서드 3 = 학생 정보 출력
	public void showInfo() {
		System.out.println(studentName +"님의 남은 돈은 "+ money +"원 입니다.");
	}
	
	
	
}
