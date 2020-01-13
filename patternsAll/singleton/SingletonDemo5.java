package singleton;/*
                  * 静态内部类方式单例
                  * 懒加载
                  * 线程安全，调用效率高，也实现延时加载，推荐使用
                  * */

import java.io.Serializable;

public class SingletonDemo5 implements Serializable {
    private static class SingletonClassInstance {
        private static final SingletonDemo5 instance = new SingletonDemo5();
    }

    public static SingletonDemo5 getInstance() {
        return SingletonClassInstance.instance;

    }

    private SingletonDemo5() {
    }

    // 反-反序列化
    private Object readResolve() throws Exception {
        return getInstance();
    }

}