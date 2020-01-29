package Observer;

/**
 * Main
 */
public class Main {

      public static void main(String[] args) {
            NumberGenerator generator = new RandomNumberGenerator();
            // NumberGenerator generator = new IncrementalNumberGenerator(10,50,5);
            Observer observer1 = new DigitObserver();
            Observer observer2 = new GraphObserver();
            Observer observer3 = new PieObserver();
            generator.addObserver(observer1);
            generator.addObserver(observer2);
            generator.addObserver(observer3);
            while (true) {
                  generator.execute();

            }
      }
}