package inheritance08.vo;

public class Customer {
	
    // 멤버 변수 
	// VIPCustomer라는 자식 클래스가 직접 접근해야 하므로 앞에 protected 선언
    protected int customerID;        // 아이디
    protected String customerName;   // 이름
    protected String customerGrade;  // 등급
    protected double bonusRatio;     // 적립률(보너스 포인트 적립 비율)
    protected int bonusPoint;        // 포인트

    // 기본 생성자
    public Customer() {}

    // 생성자 오버로드
    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;
    }

    // 보너스 적립 & 결제금액(할인 전) 반환
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio; // 포인트 적립
        return price;                     // 일반 고객은 할인 없음
    }

    // 고객 정보 print
    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며,"
        		+ " 보너스 포인트는 " + bonusPoint + " 점 입니다.";
    }

    // getter/setter
    public int getCustomerID() { return customerID; }
    public void setCustomerID(int customerID) { this.customerID = customerID; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getCustomerGrade() { return customerGrade; }
    public void setCustomerGrade(String customerGrade) { this.customerGrade = customerGrade; }

    public int getBonusPoint() { return bonusPoint; }
    public void setBonusPoint(int bonusPoint) { this.bonusPoint = bonusPoint; }

    public double getBonusRatio() { return bonusRatio; }
    public void setBonusRatio(double bonusRatio) { this.bonusRatio = bonusRatio; }
}
