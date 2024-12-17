package extends1.ex2;


public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); //Car에게 상속받아서 move()를 사용할 수 있게됨.
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move(); //Car에게 상속받아서 move()를 사용할 수 있게됨.
        gasCar.fillUp();
    }
}
