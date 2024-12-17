package extends1.ex3;

public class ElectricCar extends Car {
    public void charge() { //Car로부터 move() 상속받음
        System.out.println("충전합니다.");
    }
}
