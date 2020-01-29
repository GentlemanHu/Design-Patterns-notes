package State;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Main
 */
public class Main {
      public static void main(String[] args) {
            SafeFrame frame = new SafeFrame("Simulator State");
            ExecutorService eService = Executors.newFixedThreadPool(1);
            Future<Void> futureTask = eService.submit(new Callable<Void>() {
                  public Void call() throws Exception {
                        // TODO Auto-generated method stub
                        while (true) {

                                    frame.setColor();
                              
                              return null;
                        }

                  }

            });
            while (true) {
                  for (int hour = 0; hour < 24; hour++) {
                        frame.setClock(hour);
                        try {
                              Thread.sleep(1000);
                        } catch (Exception e) {
                              System.out.println("异常 。。。");
                        }
                  }
            }
      }
}