package basicclass14;

/*
     Object 클래스의 hashCode()
      =객체의 해시코드 (int 차입의 정수) 를 반화하는 메서드
      =다량의 데이터 저장이나 검색하는 해싱 기법에 유용하게 사용
      =해시 함수 => 찾고자 하는 값을 입력하면, 그값이 저장된 위치를 알려주는 해시코드를 반환해줌
      
      # 해시코드
      =임의로 된길이의 데이터를 고정된 길이의 데이터로 매핑하는 것으로
      = 해시함수를 통해 얻어지는 값
      = 원하는 데이터를 빠르게 찾기위해 사용 
      
      # 오버라이딩 하는 이유 
      =문자열 기준으로 논리적 같은 내용이면 같은 해시코드를 가져야 하는데,
      =안할경우 다른 해시 코드를 갖게 되기 때문에 해줘야 함 
        
 */

public class HashCode01Basic {
   public static void main(String[] args) {
      
	   Book str1 = new Book(1000,"책 제목");
	   Book str2 = str1; 
	   Book str3 = new Book (1000,"책 제목");
	   Book str4 = new Book (1001,"책 제목2");
	   	   
	   //기본 출력
	   System.out.println(str1); //basicclass14.Book@26f0a63f
	   System.out.println(str2); //basicclass14.Book@26f0a63f
	   System.out.println(str3); //basicclass14.Book@4926097b
	   System.out.println(str4); //basicclass14.Book@762efe5d
	   
	   //hashCode 사용
	   System.out.println(str1.hashCode()); //653305407
	   System.out.println(str2.hashCode()); //653305407 
	   System.out.println(str3.hashCode()); //1227229563
	   System.out.println(str4.hashCode()); //1982791261

	   /*
	   str1과 str2는 대입연산으로 인해 논리적으로 해시값도 맞고 물리적으로 메모리 번짓수도 같게 나온다.
	   하지만, str3은 해시값은 같지만 메모리 번짓수는 다르다. 
	   반대로 str4는 해시값도 다르고 메모리번짓수도 다르게 나온다.
	   */
	   
	   // 그래서 boolean 비교연산을 통해 true, false를 확인해보기로한다
	   if(str1 == str2) { // true
			System.out.println("str1 == str2 메모리주소가 같음");
		}else {
			System.out.println("str1 == str2 메모리주소가 다름");
		}
	   
	    // String 객체 =  equals() 이용
		if(str1.equals(str2)) {
			System.out.println("equals() 글자 내용 비교 : " + str1.equals(str2));
		}
		
	   System.out.println("해시코드1 : " + str1.hashCode()); //96354
	   System.out.println("해시코드2 : " + str2.hashCode()); //96354 
	   //str1과 str2는 내용이 같기 때문에 hashCode() 값도 같지만, (물리적)메모리번지수는 다르다. 
	   System.out.println("해시코드3 = 다른결과 " + str3.hashCode()); //2987074  
	   //str3은 한 글자 다르니까 hashCode() 값도 다르다.
	   
	   System.out.println(System.identityHashCode(str1));
	   System.out.println(System.identityHashCode(str2));
   }

}
