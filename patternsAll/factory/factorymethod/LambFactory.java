package factory.factorymethod;

public class LambFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Lamb();
    }
}
