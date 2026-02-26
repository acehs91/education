package controlstatement06;
/*
  반복문 : loop
  [형식]  
  while(조건식) { // 조건식이 참인 경우 반복 수행
   		수행문;
		증검식; // (중요)반드시 있어야 함. 없으면 무한 루프  	
  }
 */

import java.util.Scanner;

public class Control03While {
	public static void main(String[] args) {	
		
		//초깃값
		int num = 1;
		int sum = 2;
		
		//while문 사용
		while (num <= 10) {
			sum += num; //복합대입연산자 sum 과 
			num++; // 증감식
		}
		System.out.println("1부터 10까지의 합은 : " + sum + "입니다.");
		
		
		int i = 1;
		while (i <= 5) {
		    System.out.println(i + "번째 출력");
		    i++; // i를 1씩 증가시켜 조건이 언젠가 false가 되도록!
		}
		
		/*
		// 예시: DB에서 게시글 목록 불러오기
		String sql = "SELECT title, writer, regdate FROM board";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		// rs.next() : 다음 행(row)이 있으면 true 반환
		while (rs.next()) {
		    String title = rs.getString("title");
		    String writer = rs.getString("writer");
		    String date = rs.getString("regdate");

		    System.out.println("제목: " + title + " | 작성자: " + writer + " | 날짜: " + date);
		}
		*/
	
	}
}
