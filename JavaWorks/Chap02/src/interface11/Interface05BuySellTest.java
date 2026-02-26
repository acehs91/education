package interface11;

public class Interface05BuySellTest {
	
	 public static void main(String[] args) {
		 
		 Interface04BuySellImpl buySell = new Interface04BuySellImpl();
		 
		 buySell.showInfo();
		 buySell.buy();
		 buySell.sell();
		 System.out.println(buySell);
		 
		 Buy buy = buySell;
		 buy.buy();
		 System.out.println("다형성 Buy형" + buy);
		 
		 Sell sell = buySell;
		 sell.sell();
		 System.out.println("다형성 Sell형" + sell);
    }

}
