package poly.car0;

public class CarMain0 {

    public static void main(String[] args) {

        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();

        //추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null); //참조를 제거해야 drive() 메서드에서 만들어 놓은 분기가 제대로 작동함
        driver.setModel3Car(model3Car);
        driver.drive();

    }
}
