package singleton;

import java.lang.reflect.Constructor;

/**
 * Reflection 
 * 通过反射，破解各种单例，除了enum外
 */
public class Reflection {

      public static void main(String[] args) throws Exception{
            SingletonDemo1 s1 = SingletonDemo1.getInstance();
            SingletonDemo1 s2 = SingletonDemo1.getInstance();
            //单例输出实例一致
            System.out.println(s1);
            System.out.println(s2);


            Class<SingletonDemo1> cla = (Class<SingletonDemo1>) Class.forName("singleton.SingletonDemo1");
            Constructor<SingletonDemo1> c = cla.getDeclaredConstructor(null);
            //加上这一行可访问
            c.setAccessible(true);

            SingletonDemo1 sDemo1 = c.newInstance();
            SingletonDemo1 sDemo12 = c.newInstance();
            //输出实例不一致，说明单例被破解
            System.out.println(sDemo1);
            System.out.println(sDemo12);
            

            //下列为反-反射测试
            Class<SingletonDemo2> cla2 = (Class<SingletonDemo2>) Class.forName("singleton.SingletonDemo2");
            Constructor<SingletonDemo2> c2 = cla2.getDeclaredConstructor(null);
            //加上这一行可访问
            c2.setAccessible(true);

            SingletonDemo2 s2Demo1 = c2.newInstance();
            SingletonDemo2 s2Demo12 = c2.newInstance();
            //输出实例不一致，说明单例被破解
            System.out.println(s2Demo1);
            System.out.println(s2Demo12);

      }
}