package object06;

public class KdStudent {
	
	//변수
    private String studentName;
    private int money;

    
    //생성자
    public KdStudent(){}
    public KdStudent(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    //생성자로 인해 생성된 객체 안에 있는 "값" 인자를 불러옴
    public String getStudentName() { return studentName; } //10000
    public int getMoney() { return money; } //1000000
    
    public void takeBus(KdBus bus){
        bus.BusTake(1000);    // 학생이 버스를 타면서 1000원을 내고 
        this.money -= 1000;   // 학생 돈을 차감
    }

    public void takeSubway(KdSubway sub){
        sub.SubTake(1500);  // 학생 지하철을 타면서 1500원을 내고 
        this.money -= 1500; // 학생 돈을 차감
    }

    public void balance() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}