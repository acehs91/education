package variable01;
//int (숫자)
//String(문자)
//private(은밀한) : 외부에서 직접 접근 불가
//void(텅빈우주) : 리턴타입이 없는거 (야구:포수 받기만하는거)
//new (생성자함수) : 인스턴스 복사 & 메모리번짓수 자동부여
public class ReferenceData1 {
    //변수
    int ref = 100;
    String str_ref = "참조타입";
    
    // 숫자 get,set
    public int getRef() {
        return ref;
    }
    public void setRef(int ref) {
    	this.ref = ref;
    }
    // 문자 get,set
    public String getStr() {
        return str_ref;
    }
    public void setStr(String str_ref) {
    	this.str_ref = str_ref;
    }
    //main 메서드는 JB04ReferenceType에서 호출(내장함수와같다) >>
}
