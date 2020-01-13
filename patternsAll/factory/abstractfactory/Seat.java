package factory.abstractfactory;

public interface Seat {
    void massage();
}

class LowSeat implements Seat{
    @Override
    public void massage() {
        System.out.println("有点爽");
    }
}

class HighSeat implements Seat{
    @Override
    public void massage() {
        System.out.println("太爽了！");
    }
}
