package basicclass14;


//내부클래스
class Stundent {
	int id;
	String name;
	
	public Stundent(int id ,String name) {
		this.id = id;
		this.name = name;
	}
	
}
public class Equals01Object {

	public static void main(String[] args) {
		
		Stundent stdKim = new Stundent(100, "KIMMS");
		System.out.println(stdKim);
		Stundent stdKim2 = stdKim;
		System.out.println(stdKim2);
		
		//참조주소명은 다르지만, 논리적으로 같은 학생
		Stundent stdLee = new Stundent(100, "KIMMS");
		System.out.println(stdLee);
		
		
		if(stdKim == stdKim2) {
			System.out.println("참조주솟값 stdKim과 stdKim2의 메모리주소가 같음");
		}else {
			System.out.println("참조주솟값 stdKim과 stdKim2의 메모리주소는 다름");
		}
		
		if(stdKim.equals(stdLee)) {
			System.out.println("참조주솟값 stdKim과 stdLee의 메모리 주소가 같음");
		}else {
			System.out.println("참조주솟값 stdKim과 stdLee의 메모리 주소는 다름");
		}
		
		
	}

}
