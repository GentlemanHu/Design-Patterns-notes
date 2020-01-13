package factory.factorymethod;

/*
 *
 * 简单工厂
 *
 * */
public class Client1 {
    public static void main(String[] args) {
        Car c1 = new LambFactory().createCar();
        Car c2 = new BWMFactory().createCar();

        c1.run();
        c2.run();



    }
}
