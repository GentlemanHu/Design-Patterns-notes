package singleton;

import java.util.concurrent.CountDownLatch;

/*
* 测试得到实例时间，单位ns
*
    singleton.SingletonDemo1@77459877
    singleton.SingletonDemo1@77459877
    1425732 ns
    singleton.SingletonDemo2@1218025c
    singleton.SingletonDemo2@1218025c
    400564 ns
    singleton.SingletonDemo3@87aac27
    singleton.SingletonDemo3@87aac27
    458169 ns
    INSTANCE
    INSTANCE
    370864 ns
    singleton.SingletonDemo5@e9e54c2
    singleton.SingletonDemo5@e9e54c2
    533039 ns
显然枚举最快，或许有其他原因影响，但直观上是如此的。
*
*
* */


class MainToTest {
    public static void main(String[] args) throws Exception {
        long time1 = System.nanoTime();
    SingletonDemo1 i1 =SingletonDemo1.getInstance();
    SingletonDemo1 i2 = SingletonDemo1.getInstance();
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(System.nanoTime()-time1+" ns");

        long time2 = System.nanoTime();
    SingletonDemo2 d21 = SingletonDemo2.getInstance();
    SingletonDemo2 d22 = SingletonDemo2.getInstance();
        System.out.println(d21);
        System.out.println(d22);
        System.out.println(System.nanoTime()-time2+" ns");

        long time3 = System.nanoTime();
    SingletonDemo3 d31 = SingletonDemo3.getInstance();
    SingletonDemo3 d32 = SingletonDemo3.getInstance();
        System.out.println(d31);
        System.out.println(d32);
        System.out.println(System.nanoTime()-time3+" ns");

        long time4 = System.nanoTime();
    SingletonDemo4 d41 = SingletonDemo4.INSTANCE;
    SingletonDemo4 d42 = SingletonDemo4.INSTANCE;
        System.out.println(d41);
        System.out.println(d42);
        System.out.println(System.nanoTime()-time4+" ns");

        long time5 = System.nanoTime();
    SingletonDemo5 d51 = SingletonDemo5.getInstance();
    SingletonDemo5 d52 = SingletonDemo5.getInstance();
        System.out.println(d51);
        System.out.println(d52);
        System.out.println(System.nanoTime()-time5+" ns");

        System.out.println("-----------------");
        //下边测试10个时间
        //long[] times = new long[10];
        long averTime=0;
        for(int i =0;i<10;i++){
            long time = System.nanoTime();
            SingletonDemo1 test =SingletonDemo1.getInstance();
            System.out.println(System.nanoTime()-time+" ns");
            //times[i] = System.nanoTime()-time;
            //加了一行运行时间能多几万ns。。。
            averTime=System.nanoTime()-time;
            System.out.println(averTime);
            System.out.println(test);
            System.out.println("```````````");
        }
        System.out.println(averTime/10);

        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~");
        //下面为多线程环境下，各种单例的效率

        long start = System.nanoTime();
        int threadNum = 20;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for(int i=0;i<threadNum;i++){
            new Thread(
                new Runnable(){
                    @Override
                    public void run() {
                        // TODO Auto-generated method stub
                        for(int i = 0;i<10000000;i++){
                            Object o = SingletonDemo1.getInstance();
                        }
                        countDownLatch.countDown();
                    }
                }
            ).start();
        }
        countDownLatch.await();
        long end = System.nanoTime();

        System.out.println(end - start);
    }
}