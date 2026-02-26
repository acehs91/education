package object06;

public class Oop100ClassCo2 {
    public static void main(String[] args) {

        KdStudent hsk = new KdStudent("김현수", 1000000);
        System.out.println(hsk.getStudentName() + "의 보유 현금은 " + hsk.getMoney() + "원 입니다.");

        KdBus bus1224 = new KdBus(1224);
        KdSubway sub4  = new KdSubway(4);
        
        hsk.takeBus(bus1224);
        hsk.balance();
        bus1224.busInfo();
       
        hsk.takeSubway(sub4);
        hsk.balance();
        sub4.subInfo();

    }
}
