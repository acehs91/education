package interface11;

public class Interface03CalculTest  {
  public static void main(String[] args) {
	  
	  	//Interface02CalculImpl
	  	//add, substract , times , divide 호출하는데..음
	  	Interface02CalculImpl calc = new Interface02CalculImpl();
	  	
        System.out.println("매개값 : 10,5 사용");
        //사용
        System.out.println(calc.add(10, 5));
        System.out.println(calc.substract(10, 5));
        System.out.println(calc.times(10, 5));
        System.out.println(calc.divide(10, 5));
        //일반 메서드 사용
        calc.showInfo();
    }
}
