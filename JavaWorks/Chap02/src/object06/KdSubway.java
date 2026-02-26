package object06;

public class KdSubway {
    private int line;    
    private int passengerCount;
    private int money;

    public KdSubway(){}
    public KdSubway(int line){this.line = line;}

    public void SubTake(int fare) {
        money += fare;
        passengerCount++;
    }

    public void subInfo() {
        System.out.println("지하철 " + line + "호선의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
    }
}
