package arraylist09;

public class Subject {
	
    private String SubjectName; // 과목명
    private int Score;          // 점수

    public Subject() {}

    public Subject(String SubjectName, int score) {
        this.SubjectName = SubjectName;
        this.Score = score;
    }

    public String getSubjectName() { 
    	return SubjectName;
	}
    public void setSubjectName(String SubjectName) { 
    	this.SubjectName = SubjectName; 
	}

    public int getScore() { 
    	return Score; 
	}
    public void setScore(int score) {
    	this.Score = score; 
	}
}
