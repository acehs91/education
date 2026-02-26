package generic12;
/* 제네릭 사용 = 타입 파라미터 클래스 사용 
   : 클래스 선언시 타입 파라미터 사용
   ( 타입 자동 컴파일)
*/
public class GenericBoxTest2<T> {
	
	//멤버변수
    private T object;
    //get,set
    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
