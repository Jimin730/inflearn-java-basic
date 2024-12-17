package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        //super(); //생성자를 1개라도 정의한다면 자바에서 기본 생성자를 생성하지 않는다. ClassB에는 생성자를 2개나 정의해 놓았기 때문에 직접 생성자를 호출해야한다.
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
