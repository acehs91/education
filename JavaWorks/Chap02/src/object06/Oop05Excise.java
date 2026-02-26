package object06;

public class Oop05Excise {
    public static void main(String[] args) {

    	/*
        People exe = new People();
        exe.setAgeNum(33);
        exe.setName("김이젠");
        exe.setMarried(false);  
        exe.setChild(0);
        */
    	
    	//위 코드와 같은 한 줄로 코드
        People exe = new People("김이젠", 33, false, 0);
    	
        String marriageStatus;  

        if (exe.isMarried()) {
            marriageStatus = "기혼";
        } else {
            marriageStatus = "미혼";
        }

        // Getter로 콘솔 출력
        System.out.println("이름: " + exe.getName() + "님");
        System.out.println("나이: " + exe.getAgeNum() + "세");
        System.out.println("결혼유무: " + marriageStatus );
        System.out.println("자녀 수: " + exe.getChild() + "명");
    }
}
