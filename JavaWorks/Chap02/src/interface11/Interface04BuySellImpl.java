package interface11;

public class Interface04BuySellImpl implements Buy, Sell {

	
	
	@Override
    public void sell() {
        System.out.println("판매하기");
    }

	 
    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    public void showInfo() {
        System.out.println("==== 인터페이스 클래스형 메서드 =====");
    }
	
    
   
    
}
