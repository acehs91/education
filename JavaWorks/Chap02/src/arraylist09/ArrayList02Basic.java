package arraylist09;

import java.util.ArrayList;

/*ArrayList 객체 배열기초 정리*/
public class ArrayList02Basic {
	public static void main(String[] args) {
		 
		// 1. ArrayList 생성 제네릭 타입 String (String 타입만 저장)
        ArrayList<String> lists = new ArrayList<String>();
        
		//2. 객체배열에 문자열 5개 각각 할당
        lists.add("가을");
        lists.add("월요일");
        lists.add("추워");
        lists.add("자바");
        lists.add("스프링");
        
        
        System.out.println("============== 기본 출력 ===================");
        
        // 3. for문 활용
        for (String result : lists) {
            System.out.println(result);
        }
        
        System.out.println("============== 갯수 출력 ===================");
        
        // 4. 총 갯수 가져오기 
        int total = lists.size();
        System.out.println("총 배열 이아템 사이즈" + total );
        
    
        System.out.println("============== 원하는것만 출력 ===================");
        // 5. 원하는 객체 배열 가져오기
        String list2 = lists.get(2); //2번째만 가져옴
        System.out.println("메모리 주소 번지 : " + list2); //추워
        
        System.out.println("============== 그냥 for문 ===================");
        
        // 6. 배열아이템 출력
        for (int i=0; i < lists.size(); i++) {
        	String str = lists.get(i);
            System.out.println(i +"번: " + str);
        }
        
        System.out.println("==============밑에는 향상 for===================");
        
        // 7. 향상 for
        int index = 0;
        for (String str : lists) {
            System.out.println(index + "번:" + str);
            index++;
        }
        
        System.out.println("============== 제거 후 for문 출력 ===================");
        
        // 8. 배열아이템 제거
        lists.remove(2); // 객체 메모리 번짓수 삭제
        lists.remove("월요일"); //객체 값 지정 삭제
        //제거 후 for문 출력 
        for (int i = 0; i < lists.size(); i++) {
        	String str =  lists.get(i);
            System.out.println(i + ":" + str);
            
        }
        
	}
}
