package collectionframework15;

import java.util.*;

/*
      컬렉션 프레임 워크
      : 데이터 덩어리들을 저장하는 클래스들을 표준화 한 설계를 말함
       컬렉션(collection) = 다수의 데이터 = 데이터 그룹
       
       프레임워크 =표준화된 프로그래밍 방식
       모든 컬렉션 프레임워크 클래스들을 표준화된 방식으로 다룰수있도록 체계화 한 것임
       
       
      사용장점
      : 컬렉션(=다수의 데이터) 를 다루는데 필요한 다양한 클래스들을 제공
      = 개발자가 더욱 편하게 개발할수 있고 인터페이스/다형성을 이용한 객체지향적 설계를 표준화되어 있음
      = 즉 다양한 종류의 데이터를 동일한 방식으로 다루는 것이 가능해 짐
      
      컬렉션 프레임워크 핵심 인터페이스 
      : 컬렉션 데이터 그룹(=3가지 타입), 각 컬렉션을 다루는데 필요한 기능을 가진 3개의 인터페이스를 정의
      [구조]
      collection 인터페이스 
            |
      List + Set + Map 인터페이스
            |
    각각 구현을 한 클래스들이 존재
    => (결론) 컬렉션 프레임 워크의 모든 클래스들은 List, Set, Map 인터페이스 중 하나를 구현했음
          구현 클래스들의 이름을 보면 클래스들의 틀징을 대략 눈치챌수 있음
          
    #Collection 인터페이스
    :List,Set 인테페이스의 조상 인터페이스
     컬렉션 크랠스에 저장된 데이터를 읽고, 추가,삭제하는등 컬렉션을 다루는 가장 기본적인 메서드들을 정의함
     
     ## List 인터페이스
     : 중복을 허용하면서 저장순서사 유지되는 컬렉션을 구현하는데 사용
     Vector클래스 , ArrayList클래스, LinkedList 클래스가 있음
     
     ## Set 인터페이스
     : 중복을 허용하지않고 저장순서가 유지되지 않는 컬렉션을 구현하는데 사용
     HashSet클래스 , TreeSet 클래스 가있음
     
     ## Map 클래스
     : Key, Value 를 하나의 쌍으로 묶어서 저장하는 컬렉션 클래스를 구현하는데 사용
     Key는 중복될수없지만 값은 줄복을 허용 => 기존 중복된 키, 값을 저장하면 마지막에 저장된 값이 남게됨
     HashMap클래스 , TreeMap 클래스 등이있음
     
     (참고) 
     Map 인터페이스 = Value(값) 은 중복을 허용하기 때문에, Collection 타입으로 반환
                 Key(키) 는 중복을 허용 하지않기 때문에 => Set타입으로 반환
     
     ==========================================================================
     
     ### ArrayList 
     :컬렉션 프레임 워크에서 가장많이 사용되는 컬렉션 클래스임
     List 인터페이스를 구현하기 때문에 데이터의 저장순서가 유지, 중복을 허용한다는 특징을 가짐
     기존Vector 를 개선한 것으로 구현원리, 기능이 동일함
     
     Object 배열을 이용하여 데이터를 (순차적) 으로 저장 
     => (예) 첫번쨰 객체 Object [0] 에 저장 다음객체 Object[1]...\
       배열에 더이상 저장할 공간이 없으면 기본배열을 (복사) 한다음에 사용
     (참고) 정렬 방식 =Collection의 sort() 를 이용
     
 */
public class Collection01Basic {

   public static void main(String[] args) {
	   

	   // List 예제 (중복허용, 순서 있음) =  fruits
	   List<String> fruits = new ArrayList<>();
	   fruits.add("Apple");
	   fruits.add("Banana");
	   fruits.add("Apple");
	   System.out.println("List 예제 : " + fruits);
	   
	   // Set 예제 (중복 허용 안됨, 순서 없음)
	   Set<String> uniqueFruits = new HashSet<String>();
	   uniqueFruits.add("Apple");
	   uniqueFruits.add("Banana");
	   uniqueFruits.add("Apple");
	   System.out.println("Set 예제 :" + uniqueFruits);
	   
	   //Map 예제 (Key , Value 쌍으로 저장, Key는 중복 불가)
	   Map<Integer, String> map = new HashMap<>();
	   map.put(1001, "Tom");
	   map.put(1002, "Jane");
	   map.put(1001, "Alex"); // 같은 key(1001) → 덮어쓰기되서 안나옴

	   System.out.println( "map 예제 : " + map); // {1001=Tom, 1002= Jane, 1003= Alex}
   }

}
