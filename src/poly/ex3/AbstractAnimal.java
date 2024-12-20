package poly.ex3;

public abstract class AbstractAnimal { //추상 클래스

    public abstract void sound(); //추상 메서드. 추상 메서드가 하나라도 존재하면 추상 클래스로 선언해주어야 한다. 안하면 컴파일 오류

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
