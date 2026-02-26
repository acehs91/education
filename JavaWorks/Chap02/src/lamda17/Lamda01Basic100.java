package lamda17;

import java.util.*;
import java.util.function.Consumer;

public class Lamda01Basic100 {
	
	/* 함수형 인터페이스 정의 = 가독성, 재사용성 */
	@FunctionalInterface
	interface MyCalulator {
		int calulate(int a , int b);
	}
	
    public static void main(String[] args) {
    	
    	//1.List 람다식 처리
    	List<String> names =  Arrays.asList("Alice","Bob","Charlie");
     
    	System.out.println("람다식으로 List 순회 : " + names);
    	System.out.println("===================List방식==============");
    	
    	//2.forEach함수 + 람다식 처리    	
    	names.forEach(name -> 
    		System.out.println("이름 : " + name)
		);
    	System.out.println("===================forEach방식===========");
    	
    	//3.Map함수 +  람다식 처리
    	//*맵 함수는 (K,V) 형태로 호출시 .put()을 사용하는것을 외우자
    	Map<Integer, String> studentMap = new HashMap<Integer, String>();
    	studentMap.put(1001, "Alice");
    	studentMap.put(1002, "Bob");
    	studentMap.put(1003, "Charlie");

    	System.out.println("람다식으로 Map방식 순회");
    	
        studentMap.forEach((id, name) -> 
            System.out.println("학번: " + id + ", 이름: " + name)
        );
        System.out.println("===================Map방식===============");
        
        //4. java 제공 함수형 인터페이스 = Consumer
        //Consumer<T> : 매매개변수 1개를 받아 소비(=출력,처리)하며 반환값은 없음
        
        Consumer<String> printer = s -> System.out.println("출력:" + s);
        printer.accept("간단한 람다식 연습");
        
        //5. 사용자 정의 함수형 인터페이스
        MyCalulator add = (a,b) -> a + b; // 더하기 기능
        MyCalulator multiply = (a,b) -> a * b; // 곱하기 기능
        
        System.out.println("===================Consumer 내장 함수 사용===============");
        System.out.println("더하기 결과 : " + add.calulate(10, 5));
        System.out.println("곱하기 결과 : " + multiply.calulate(10, 5));
        // add 더하기 
        // multiply 곱하기
    }
}