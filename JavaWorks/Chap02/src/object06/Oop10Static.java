package object06;

public class Oop10Static { 
	
	// static 변수 선언: 모든 인스턴스가 공유하는 공용번호
	// 프로그램이 실행될 때 딱 한 번 메모리에 만들어지는 공용 변수
	static int serialNum = 1000;
	
	// 멤버변수 (인스턴스 변수)
	int studentId;
	String studentName;
	int grade;
	String address;
	
	
	// 아이디
	public int getStudentId() { return studentId; }
	public void setStudentId(int studentId) { this.studentId = studentId; }
	
	// 이름
	public String getStudentName() { return studentName; }
	public void setStudentName(String studentName) { this.studentName = studentName; }
	
	// 등급
	public int getGrade() { return grade; }
	public void setGrade(int grade) { this.grade = grade; }
	
	// 주소
	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }

	
	// ✅ static setter/getter 수정 완료
	public static void setSerialNum(int serialNum) {
		Oop10Static.serialNum = serialNum;  // ✅ 자기 클래스명으로 참조해야 함
	}
	public static int getSerialNum() {
		return serialNum;
	}
	
	// ✅ 생성자 함수
	public Oop10Static(String studentName) {
		this.studentName = studentName; // 이름 저장
		serialNum++;                    // 공용번호 증가
		this.studentId = serialNum;     // 증가된 번호를 개인 ID로 저장
	}
}
