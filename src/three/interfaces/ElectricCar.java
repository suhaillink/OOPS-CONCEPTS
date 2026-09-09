package three.interfaces;

public class ElectricCar implements CarControl{

    @Override
    public void trunRight() {
        System.out.println("ElectricCar trunRight");
    }

    @Override
    public void trunLeft() {
        System.out.println("ElectricCar trunLeft");
    }

    @Override
    public void applyBrake() {
        System.out.println("ElectricCar applyBrake");
    }
}
