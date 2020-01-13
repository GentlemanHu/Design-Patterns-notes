package factory.simplefactory;
/*
*
* 简单工厂
*
* */
public class Client1 {
    public static void main(String[] args) {
        Car c1 = new BWM();
        Car c2 = new Lamb();

        c1.run();
        c2.run();
        System.out.println("-------");

        Car c3 = CarFactory.createCar("Lamb");
        c3.run();

        System.out.println("--------");

        Car c4 = CarFactory.createBWM();


    }
}
