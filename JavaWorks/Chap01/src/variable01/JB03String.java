package variable01;

/* String Type = 문자열 */
public class JB03String {
	public static void main(String[] args) {
		String str1 = "Hello World";
		System.out.println(str1);
		
		//Character(한글자만 가능)
		char str2 = 'H';
		System.out.println(str2);
		
		// 개행시 에러
		//System.out.println("Hello"
		// World");
		System.out.println("Hello" + "World");
		
		//Escape(도망치다) 문자 = 회피문자 = 띄어쓰기 \n
		System.out.println("Hello \n World");
		
		//쌍따옴표 출력시 = 결과 =  "World" 
		System.out.println("Hello \"World\"");
		
		
		// 실습. 변수명 str3 ("Ezen Computer"), str4("Hello mcssam")에 문자열  ... 할당
		// (콘솔) str3의 문자 갯수를 구한 후 출력
		String str3 = "Ezen Computer";
		String str4 = "Hello mcssam";
		
		System.out.println("글자수 : " + str3.length());
		
		// (콘솔) str4에 할당된 문자열을 gimssam으로 변경 => replace() | 캡쳐, 넘버링
		System.out.println(str4.replace("mcssam", "gimssam"));
        
		String name = "hskim";
		System.out.println("안녕하세요.\n" + name + "님 반갑습니다.");
		
				
	}
}
