package object06;

public class Subject {

    String subjectName;
    int subjectID;

    public Subject(String subjectName, int subjectID) {
        this.subjectName = subjectName;
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
    	return subjectName;
	}
    public void setSubjectName(String subjectName) { 
    	this.subjectName = subjectName; }

    public int getSubjectID() { return subjectID; }
    public void setSubjectID(int subjectID) { this.subjectID = subjectID; }
}
