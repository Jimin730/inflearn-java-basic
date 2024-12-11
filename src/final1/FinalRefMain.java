package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); //data에는 참조값이 들어가있음
//        data = new Data(); //컴파일 오류. 위에서 이미 담음

        //참조 대상의 값은 변경이 가능
        data.value = 10; //value 변수 자체는 final이 아님. -> 값을 계속 변경할 수 있음
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
