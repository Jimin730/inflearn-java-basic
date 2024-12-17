package extends1.overriding;

public class ElectricCar extends Car {

    @Override //오버라이드 해서 기능을 재정의
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() { //Car로부터 move() 상속받음
        System.out.println("충전합니다.");
    }

}
