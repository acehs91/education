package object06;

public class Oop04ClassInstanceTest {
	
	 int studentid;
	 String studentName;
	 int grade;
	 String address;
	 
	//이름  
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String name) {
        this.studentName = name;
    }
    
    //등급
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
	//학생 ID
    public int getStudentId() {
	        return studentid;
    }
    public void setStudentId(int id) {
	        this.studentid = id;
    }

    public static void main(String[] args) {
		 /*
		 	※클래스를 사용하려면 new 키워드로 반드시 생성하여 사용해야 함(메모리할당)
		 	'인스턴스'를 할당 받은 변수명을 Reference 또는 참조 변수라고 하며
		 	객체는 heap(동적메모리)공간에 할당
		  */
		 Oop04ClassInstanceTest info = new Oop04ClassInstanceTest();
		 //System.out.println(info);
		 
		 info.setStudentName("김이젠");
		 info.setGrade(3);
		 info.setStudentId(100);
		 
		 System.out.println("학생이름 : " + info.getStudentName());
		 System.out.println("등급 : " + info.getGrade());
		 System.out.println("학생의 id: " + info.getStudentId());
		 System.out.println("주소값 : " + info);
	        
	}
}