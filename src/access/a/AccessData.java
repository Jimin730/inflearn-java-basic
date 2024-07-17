package access.a;

public class AccessData {

    public int publicField;
    int defalutField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출 " + publicField);
    }

    void defalutMethod() {
        System.out.println("defalutMethod 호출 " + defalutField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privateField);
    }

    public void innerAccess() { //자신 것은 모두 호출 가능
        System.out.println("내부 호출");
        publicField = 100;
        defalutField = 200;
        privateField = 300;
        privateMethod();
        defalutMethod();
        privateMethod();
    }

}
