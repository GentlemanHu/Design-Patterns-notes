package factory.abstractfactory;

public interface Engine {
    void run();
    void start();
}

class LowEngine implements Engine{
    @Override
    public void run() {
        System.out.println("Damm ！！！");
    }

    @Override
    public void start() {
        System.out.println("Slow ！！！");
    }
}


class HighEngine implements Engine{
    @Override
    public void run() {
        System.out.println("Speed ！！！");
    }

    @Override
    public void start() {
        System.out.println("High ！！！");
    }
}
