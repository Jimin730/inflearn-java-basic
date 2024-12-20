package poly.ex5;

public class Dog implements InterfaceAnimal{ //인터페이스는 implements 사용
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지 이동");
    }
}
