package object06;

public class Basic {
	
	int studentID;
	String studentName;
 
	public Basic(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }
	  
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName(){
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
}


