package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null; // 참조형 변수에는 아직 가리킬 값이 정해지지 않았을 때, null 값을 넣어줄 수 있다.
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
    }
}
