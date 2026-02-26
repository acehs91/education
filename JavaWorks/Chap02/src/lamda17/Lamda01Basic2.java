package lamda17;


public class Lamda01Basic2 {
    public static void main(String[] args) {
    	FunctionInterface2 fi;
    	fi = (x) -> {
    		int result = x * 5;
    		System.out.println("2 x 5 = " + result);
    	};
    	
    	fi.method(2); //print 2 x 5 = 10
    	
    	fi = (x) -> {System.out.println(x*5);};
    	fi.method(3); //print 15
    	
    	fi = (x) -> System.out.println(x*5);; //중괄호 화살표 생략 
    	fi.method(4); //print 20 
    	
    }
}
