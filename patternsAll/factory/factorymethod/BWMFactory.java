package factory.factorymethod;

public class BWMFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BWM();
    }
}
