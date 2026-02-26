package array07;
/*
   알파벳 문자와 아스키 코드 값 출력
*/
public class Array02Array {

   public static void main(String[] args) {
      // char 26자리 0~25 인덱스 번호 할당 => alphabet
      char[] alphabet = new char[26];
      // 문자 A 할당 => 변수명 ch => (콘솔)캡,넘
      char ch = 'A';
//      System.out.println(ch);
      char ch2 = 65;
//      System.out.println(ch2);
      
      // for문 alphabet의 배열요소를 모두 출력
      for(int i=0; i<alphabet.length; i++, ch++) {
         alphabet[i] = ch; // 아스키 코드값을 각 인덱스 번짓수에 할당
         System.out.println(ch);
      }
      
      // 아스키 코드 번호를 나오도록 출력
      for(int i=0; i<alphabet.length; i++) {
         System.out.println(alphabet[i] + "의 아스키코드값 => " + (int)alphabet[i]);
      }
      
   }

}
