package object06;

class Birthday{
	int day;
	int month;
	int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	//printThis
	public void printThis(int month , int year){
		System.out.println("this의 메모리 주소는 " + this + " 입니다.");
        System.out.println(month + "월");
        System.out.println(year +"년");
	}
}

public class Oop07This {
    public static void main(String[] args) {
    	
    	//생성자
    	Birthday bir = new Birthday();
    	
    	//멤버변수값
    	bir.setYear(2025);
        int result = bir.getYear();
    	System.out.println("멤버변수값 : " + result);
    	
    	//참조 주솟값
	    System.out.println("참조변수 주솟값 출력 : " + bir);
    	
	    //printThis Class로 던짐
    	bir.printThis(10,2025);
    }
}
