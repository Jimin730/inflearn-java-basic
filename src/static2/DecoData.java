package static2;

public class DecoData {

    private int instanceValue; //인스턴스 변수
    private static int staticValue; //정적 변수

    public static void staticCall() { //정적 메서드는 정적 변수, 정적 메서드에 접근할 수 있다.
        //instanceValue++; //인스턴스 변수 접근, compile error
        //instanceMethod(); //인스턴스 메서드 접근, compile error

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    public void instanceCall(){ //모두 접근 가능!
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근

    }

    public static void staticCall(DecoData data) { //외부에서 참조값을 받아오기 때문에 정적 메서드가 인스턴스 메서드와 변수에 접근이 가능해진다.
        data.instanceValue++;
        data.instanceMethod();
    }


    private void instanceMethod() { //인스턴스 메서드
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() { //정적 메서드
        System.out.println("staticValue=" + staticValue);
    }
}
