package factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();

        Engine engine = factory.createEngine();

        Seat seat = factory.createSeat();

        Tire tire = factory.createTire();


        System.out.println();
    }
}
