package factory.abstractfactory;

public interface Tire {
    void resolve();
}

class LuxuryTire implements Tire{
    @Override
    public void resolve() {
        System.out.println("飘了~~");
    }
}

class NormalTire implements Tire{
    @Override
    public void resolve() {
        System.out.println("翻车。。");
    }
}