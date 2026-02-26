package generic12;
/* 
 	#4. 멀티 타입 파라미터 
 	 : 제네릭 타입을 두 개이상의 타입 파라미터로 사용 가능
 	   각 타입 파라미터는 콤마로 구분함
 	   (예) class(K,V,...> {...}
 	   interfaceK,V,...> {...}
*/
public class GenericBoxTest3<T,M> {
    // 멤버변수
    private T kind;
    private M model;
    
    // getter / setter
    public T getKind() {
        return kind;
    }
    public void setKind(T kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }
    public void setModel(M model) {
        this.model = model;
    }
	
}
