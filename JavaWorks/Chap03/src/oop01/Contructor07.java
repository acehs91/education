package oop01;

/*
  생성자 
  : 멤버 변수 초기화를 위한 메서드
    → 인스턴스(객체)가 생성될 때 자동으로 호출되어 멤버변수 초기화 작업 수행
*/

class Car {
    String color;
    String gearType;
    int door;
    // 기본 생성자
    public Car() {}

    // 매개변수 있는 생성자
    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    
    @Override
    public String toString() {
        return color +"," +   gearType  +"," + door ;
    }
}

public class Contructor07 {
    public static void main(String[] args) {
    	
        Car car1 = new Car("blue","auto", 5);
        System.out.println(car1);
        Car car2 = new Car("white", "manual", 4);
        System.out.println(car2);
    }
}
