package object06;

public class Bus {
	
	// 멤버변수
	int busNumber; // 버스번호
	int passengerCount; // 승객수
	int money; // 버스 요금 수입
	

	// S/Getter
	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
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
	public Bus() {}
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	
	// 메서드1 = 학생이 버스를 탔을 경우 => 버스회사 수입 증가, 승객 수 증가
	public void busTake(int money) {
		this.money += money; // 버스회사 수입 증가
		passengerCount++;
	}
	
	// 메서드2 = 버스 정보 출력
	public void showInfo() {
		System.out.println("버스 "+busNumber+"번의 승객은 "+passengerCount+"명이고, 수입은 "+money+"원 입니다.");
	}
}
