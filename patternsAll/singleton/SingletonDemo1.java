package singleton;
/*
* 饿汉式单例模式
*
* */

public class SingletonDemo1 {

    //类初始化时，立即加载此对象，么有延时加载。加载类时，天然线程安全
private static final SingletonDemo1 instance = new SingletonDemo1();

private SingletonDemo1(){

}

//提供公有方法，得到实例。
//没有同步锁，调用效率高
public static SingletonDemo1 getInstance(){
    return instance;
}
}