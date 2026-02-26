package interface11;

public class Interface02CalculImpl implements Interface01Calcul {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
    	 
    	//0이 아닌값으로 나누었을 경우만 정상코드 | 0으로 나누었을경우 상수 ERROR 출력
        if (num2 != 0) {
        	return num1 / num2;
        }else {
        	return Interface01Calcul.ERROR;
        }
        
        //예외발생 = 0으로 나누었을 경우
        //return num1 / num2;
    }

    public void showInfo() {
        System.out.println("Interface02CalculImpl 인터페이스 구현 완료");
    }
}
