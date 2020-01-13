package factory.abstractfactory;

public class LowCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Tire createTire() {
        return new NormalTire();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public void runCar() {

    }
}
