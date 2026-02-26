package arraylist09;
import java.util.ArrayList;

public class Student {
	
    // 멤버변수(private으로 캡슐화)
    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjectList = new ArrayList<>();  // 선언과 동시에 생성(초기화)
    
    // 기본 생성자
    public Student(){}
    // 오버로딩 생성자
    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }
    
    // getter/setter
    public int getStudentID() {return studentID; }
    public void setStudentID(int studentID) { this.studentID = studentID;}
    public String getStudentName() { return studentName;}
    public void setStudentName(String studentName) { this.studentName = studentName;}
    public ArrayList<Subject> getSubjectList() { return subjectList; }
    public void setSubjectList(ArrayList<Subject> subjectList) { this.subjectList = subjectList; }
    
    // addSubject 메서드 생성 - 구현1 (과목 추가)
    public void addSubject(String name, int score) {
        // 생성자를 이용해 한번에 세팅
        Subject subject = new Subject();
        subject.setSubjectName(name);
        subject.setScore(score);
        subjectList.add(subject);
    }
    // showStudentInfo 메서드 생성 - 구현2 (각 과목의 성적과 총점 출력)
    public void showStudentInfo() {
        double total = 0.0;
        
        for (Subject s : subjectList) {
            total += s.getScore();
            System.out.println(studentName + " 학생의 "
            		+ s.getSubjectName() + "과목성적은 "
            		+ s.getScore() + "점 입니다.!!");
        }
        //학생의 ???의 총점은 ??? 입니다.
        System.out.println(studentName + "학생의 총점은 " + total + "입니다.");
        //학생의 ???의 평균점수는 ??? 입니다.
        System.out.println(studentName + "학생의 평균점수는 " + total/subjectList.size() + "입니다.");

    }
}
