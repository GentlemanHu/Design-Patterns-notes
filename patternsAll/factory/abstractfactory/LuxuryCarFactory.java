package factory.abstractfactory;

public class LuxuryCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new HighEngine();
    }

    @Override
    public Tire createTire() {
        return new LuxuryTire();
    }

    @Override
    public Seat createSeat() {
        return new HighSeat();
    }

    @Override
    public void runCar() {
        System.out.println("");
    }
}
