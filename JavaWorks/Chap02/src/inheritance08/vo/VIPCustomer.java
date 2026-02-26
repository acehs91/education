package inheritance08.vo;

public class VIPCustomer extends Customer {
	/*
	  Customer의 protected 멤버를
	  VIPCustomer에서도 공통으로 직접 사용 가능
	*/

	// 멤버 변수 
    private int agentID;      // 담당 상담원 ID
    private double saleRatio; // 할인율(예: 0.20 = 20%)

    // 메서드 오버라이딩 = 메서드 재정의  
    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        this.agentID = agentID;
        this.customerGrade = "VIP";
        this.bonusRatio = 0.05; // 포인트 적립 5%
        this.saleRatio = 0.20;  // 20% 할인
        this.bonusPoint = 0;  
    }
    
    @Override
    // 보너스 포인트 적립 + 할인율 적용 후 최종 결제금액 반환
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;             // 포인트 적립
        int discounted = price - (int)(price * saleRatio); // 정수 가격으로 계산
        return discounted;
    }

    @Override 
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " AgentID " + agentID + "입니다.";
    }

    public int getAgentID() { return agentID; }
}
