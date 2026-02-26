package object06;
/*
 인스턴스 = "우리가 만든 객체를 사용하는것"
 : 만든 클래스를 사용하는것
*/
public class Oop03ClassInstance {
	
		int studentId;
		String studentName;
		int grade;
		String addres;

		// type , 값을 가져오는  get => 학생 이름을 반환하는 메서드 
	    public String getStudentName() {
	        return studentName;
	    }
	    
	    //void , 값을 바꾸는 set => 학생 이름으로 값 할당하는 메서드 
	    public void setStudentName(String name) {
	    	studentName = name; //김현수
	    }
		
	    //형식적으로 수업한정 : 외부로 빼야하지만 한장으로 EntryPoint main()만듬
	    // React - APP.js 하나 함수로 호출하는것과 같음
	    public static void main(String[] args) {
	    	
	    	Oop03ClassInstance student1 = new Oop03ClassInstance(); //const student1 할당
	    	System.out.println(student1); 
	    	// 콘솔 출력:object06.Oop03ClassInstance@182decdb
	    	// 콘솔 해석:패키지.클래스이름@메모리번지수
	    	
	        student1.setStudentName("mcssam");
	        //student1.set에 ("인자")넣고
	        
	        System.out.println("학생 이름: " + student1.getStudentName());
	        //student1.get 함수에서 return 하여 학생이름 출력
	        
	    }//eom (End Of Method - 메서드의 끝)
}//eoc ( End Of Clasee - 클래스의 끝)
