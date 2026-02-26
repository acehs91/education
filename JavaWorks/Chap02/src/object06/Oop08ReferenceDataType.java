package object06;

public class Oop08ReferenceDataType {
    public static void main(String[] args) {

        // Basic , Subject 각각 생성
        Basic bas = new Basic(101, "김이젠");
        Subject sub = new Subject("수학", 12345);

        // 출력
        System.out.println("학생 ID: " + bas.getStudentID());
        System.out.println("학생 이름: " + bas.getStudentName());
        System.out.println("과목 이름: " + sub.getSubjectName());
        System.out.println("과목 코드: " + sub.getSubjectID());
    }
}
