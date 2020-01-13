package singleton;/*
                  * 懒汉式单例
                  * */

import java.io.Serializable;
import java.lang.reflect.ReflectPermission;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class SingletonDemo2 implements Serializable {
    // 加载类时不创建实例
    private static SingletonDemo2 instance = null;
    private static int count =0;
    private SingletonDemo2() {
        //下边为反-反射破解
        // if (instance != null) {
        //     throw new RuntimeException();
        // }
        ReflectPermission perm = new ReflectPermission("suppressAccessChecks","");
        AccessController.checkPermission(perm);
        ++count;
        System.out.println("Singleton Constructor Running. Instance #" + count);
    }

    // 可以延时加载，资源利用率高
    // 每次调用getInstance()方法都要同步导致并发效率低
    public static final synchronized SingletonDemo2 getInstance() {
        if (instance == null) {
            AccessController.doPrivileged(new PrivilegedAction<Object>() {
                public Object run(){
                    instance = new SingletonDemo2();
                    return null;
                }
            });
        }
        return instance;
    }
}