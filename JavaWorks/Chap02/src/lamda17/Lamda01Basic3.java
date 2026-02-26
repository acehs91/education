package lamda17;


public class Lamda01Basic3 {
    public static void main(String[] args) {

        FunctionInterface3 fi;

        // 1️.첫 번째 람다식 (변수에 저장 후 return)
        fi = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println("더하기 = " + fi.method(2, 5));
        
        
        // 2️. 두 번째 람다식 (한 줄로 간단하게)
        fi = (x, y) -> x * y; // 한 줄이면 return과 {} 생략 가능
        System.out.println("곱하기 = " + fi.method(5, 5)); // 25 출력
    }
}