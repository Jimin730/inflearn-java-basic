package extends1.overriding;

public class GasCar extends Car { //Car로부터 move() 상속받음
    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }
}
