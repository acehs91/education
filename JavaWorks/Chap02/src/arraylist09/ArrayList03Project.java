package arraylist09;
/*
   [간단 프로젝트] ArrayList 사용 | 학생 성적 출력 프로그램 구현
   [ArrayList 시나리오]
   1. 만약 어떤 학생이 10과목을 수강한다면 Subject클래스에는 멤버변수 10개 필요
   2. 하지만, 어떤 학생은 3과목, 5과목을 수강할수도 있음
   3. 이 경우 배열객체를 사용하여 프로그램을 구현
   4. Subject 클래스를 ArrayList를 활용하여 구현할 것임.
*/
/*
*  [View 출력]
   1. 학번 1001 현이 , 학번 1002 KIM MJ 두 학생이 있음
   2. 현이는 2과목 수강 => 국어100점, 수학 98점
   3. 소현이는 3과목 수강 => 국어90점, 수학 95점, 영어 100점
   4. Student클래스와 Subject 클래스 사용하여, 두 학생의 과목 성적과 총점을 각각 출력
*/
public class ArrayList03Project {
	public static void main(String[] args) {
	  	
		System.out.println("==== 현이 ====");
		Student s1 = new Student(1001, "현이");
		s1.addSubject("국어", 100);
		s1.addSubject("수학", 98);
        s1.showStudentInfo();
        
        System.out.println("===== 소현이 =====");
		Student s2 = new Student(1002, "소현이");
		s2.addSubject("국어", 90);
		s2.addSubject("수학", 95);
		s2.addSubject("영어", 100);
        s2.showStudentInfo();
        
	}
}	