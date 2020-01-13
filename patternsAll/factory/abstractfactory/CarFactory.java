package factory.abstractfactory;

public interface CarFactory {
    Engine createEngine();
    Tire createTire();
    Seat createSeat();

    void runCar();
}

