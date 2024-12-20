package poly.ex5;

public class Cow implements InterfaceAnimal{ //인터페이스는 implements 사용
    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
