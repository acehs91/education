package object06;

/* static 변수 테스트 */
public class Oop10Static2Test {

    public static void main(String[] args) {

        // 인스턴스 생성 (이름 넣어야 함)
        Oop10Static test = new Oop10Static("김현수");

        System.out.println(test.getStudentName());
        System.out.println("인스턴스의 주솟값 : " + test);

        System.out.println("현재 시리얼 번호: " + Oop10Static.getSerialNum()); // 공용 static 변수 확인

        // static 변수 증가
        Oop10Static.serialNum++;
        System.out.println("증가 후 시리얼 번호: " + Oop10Static.getSerialNum());

        Oop10Static.serialNum++;
        System.out.println("다시 증가 후 시리얼 번호: " + Oop10Static.getSerialNum());
    }
}
