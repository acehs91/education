package generic12;

import java.util.ArrayList;
import java.util.List;

public class GenericBasic01 {
    public static void main(String[] args) {
    	
        /* str1 - #0.제네릭 미사용 List (raw type 경고) */
        // Object 기반의 리스트 (제네릭 X)
        // → 어떤 타입이든 추가 가능하지만, 꺼낼 때 형변환 필요.
        List list = new ArrayList();        // ⚠️경고:타입을 지정해야한다. 
        list.add("Generics 사용안함");
        list.add("Java");

        Object str = list.get(0);           // Object로 나옴
        for (Object s : list) {
            System.out.println(s);
        }

        System.out.println("===============");


        /*str2,str3 - #1.제네릭 사용 List & for*/
        // String만 저장 가능한 제네릭 리스트 선언
        // → 타입 안전성 확보, 꺼낼 때 캐스팅 불필요
        List<String> list2 = new ArrayList<>();
        list2.add("첫번째 문자열 제네릭");      
        list2.add(1, "두번째 문자열 제네릭");   

        String str2 = list2.get(0);        
        System.out.println(str2);

        // 향상된 for문을 통해 list2 순회
        for (String i : list2) {
            System.out.println(i);
        }

        String str3 = list2.get(1);         
        System.out.println(str3);

        System.out.println("===============");


        /* #2. 제네릭 미사용 박스 (Object) */
        // Object 타입 기반의 클래스 → 제네릭 미사용
        // → set/get 모두 Object 타입이라 캐스팅 필요
        GenericBoxTest box1 = new GenericBoxTest();  // 제네릭 선언 X
        box1.setObject("제네릭 테스트(제네릭 미사용)");
        String v1 = (String) box1.getObject();       // ❗ 캐스팅 따로 필요
        System.out.println("클래스 사용시(제네릭 미사용): " + v1);

        System.out.println("===============");


        /* #3. 제네릭 사용 박스 (T) - Integer 타입 */
        // 제네릭 클래스 사용 - 타입 파라미터에 Integer 지정
        // → 정수만 허용, 컴파일 시 타입 검사
        GenericBoxTest2<Integer> box2 = new GenericBoxTest2<>(); // 제네릭 선언 O - Integer
        box2.setObject(100);
        int num = box2.getObject();            // ✅ 캐스팅 불필요 (오토언박싱)
        System.out.println("제네릭 타입 파라미터 사용(Integer): " + num);
        
        System.out.println("===============");
        
        // 실습. GenericBoxTest2 이용하여 문자열 "제네릭 타입 파일 사용" 
        GenericBoxTest2<String> box3 = new GenericBoxTest2<>();  // 제네릭 선언 O - String
        box3.setObject("제네릭 타입 파라미터 사용");              // ✅ 문자열 가능
        String str4 = box3.getObject();                         // ✅ 캐스팅 불필요
        System.out.println("제네릭 타입 파라미터 사용(String): " + str4);
        
        /* #4. 제네릭 사용 = 멀티 타입 파라미터 클래스 사용 = GenericBoxTest2 */
        // a. Tv, String 데이터형으로 제네릭 타입 파라미터 사용
        
        GenericBoxTest3<Tv, String> box4 = new GenericBoxTest3<>();
        //바꿀값
        box4.setKind(new Tv());
        box4.setModel("LG TV");
        // 바꾼후 가져옴
        Tv tv = box4.getKind();
        String model = box4.getModel();
        //출력
        System.out.println(tv);
        System.out.println(model);
        
        //b. Car, String 데이터형으로 제네릭 타입 파라미터 사용
        GenericBoxTest3<Car, String> box5 = new GenericBoxTest3<>();
        box5.setKind(new Car());
        box5.setModel("BMW");
        
        Car car = box5.getKind();
        String model2 = box5.getModel();
        
        //print
        System.out.println(car);
        System.out.println(model2);
    }
}
