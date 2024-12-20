package poly.diamond;

public class Child implements InterfaceA, InterfaceB{ //인터페이스는 몇 개가 와도 상관이 없다.
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
