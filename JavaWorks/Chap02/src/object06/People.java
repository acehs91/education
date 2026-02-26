package object06;

//클래스 People 만듬 *메소드 만든다 생각?하면될듯..
public class People {
	
    // 멤버 변수 
    String name;
    int ageNum;
    boolean isMarried;
    int child;

    // 생성자 오버로드
    // 버스 개념이랑 같음 태워서 각 위치에 할당 이 행위 자체를 오버로딩이라함 
    public People(String name, int ageNum, boolean isMarried, int child) {
        this.name = name;
        this.ageNum = ageNum;
        this.isMarried = isMarried;
        this.child = child;
    }

    
    //Setter (값 넣기)
    public void setName(String name) {this.name = name;}
    public void setAgeNum(int ageNum) {this.ageNum = ageNum;}
    public void setMarried(boolean isMarried) {this.isMarried = isMarried;}
    public void setChild(int child) {this.child = child;}

    // Getter (값 꺼내기)
    public String getName() {return name;}
    public int getAgeNum() {return ageNum;}
    public boolean isMarried() {return isMarried;}
    public int getChild() {return child;}
}
