package factory.simplefactory;
/*
* 简单工厂
*
* */
public class CarFactory {
    public static Car createCar(String type){
        switch (type) {
            case "Lamb":
                return new Lamb();
            case "BWM":
                return new BWM();
            default:
                return null;
        }
    }


    public static Car createLamb(){
        return new Lamb();
    }
    public static Car createBWM(){
        return new BWM();
    }
}
