package object06;

public class Subway {
	String lineNumber; // 지하철 호선
	int passengerCount; // 승객수
	int money; // 요금 수입
	
	public String getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	public int getPassengerCount() {
		return passengerCount;
	}
	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	// 생성자
	public Subway() {}
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	

	// 메서드1 = 학생이 지하철을 탔을 경우 수입과 승객수 증가 구현
	public void subTake(int money) {
		this.money += money;
		passengerCount++;
	}
	
	// 메서드2 = 지하철 정보 출력
	public void showInfo() {
		System.out.println("지하철 "+lineNumber+"호선의 승객은 "+passengerCount+"명이고, 수입은 "+money+"원 입니다.");
	}
}
