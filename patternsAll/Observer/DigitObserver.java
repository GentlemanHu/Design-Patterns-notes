package Observer;

/**
 * DigitObserver
 */
public class DigitObserver implements Observer {
      public void update(NumberGenerator generator) {
            System.out.println("DigitObserver:" + generator.getNumber());
            try {
                  Thread.sleep(100);
            } catch (InterruptedException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
            }
      }

}