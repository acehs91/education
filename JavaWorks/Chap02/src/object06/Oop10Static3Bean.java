package object06;

public class Oop10Static3Bean {
	public static void main(String[] args) {
		
		// 학생 여러 명 생성
		Oop10Static s1 = new Oop10Static("KIM MS");
		Oop10Static s2 = new Oop10Static("KIM MJ");
		Oop10Static s3 = new Oop10Static("Leoo GO");

		// 각자 이름 + 자동 부여된 학번 출력
		System.out.println(s1.getStudentName() + " : 학번 : " + s1.getStudentId());
		System.out.println("====================");
		System.out.println(s2.getStudentName() + " : 학번 : " + s2.getStudentId());
		System.out.println("====================");
		System.out.println(s3.getStudentName() + " : 학번 : " + s3.getStudentId());

		
	}
}
