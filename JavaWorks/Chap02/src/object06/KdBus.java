package object06;

public class KdBus {
    private int busNum;
    private int passengerCount;
    private int money;

    public KdBus(){}
    public KdBus(int busNum) {this.busNum = busNum;}

    public void BusTake(int fare) {
        money += fare;
        passengerCount++;
    }

    public void busInfo() {
        System.out.println("버스 " + busNum + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
    }
}
