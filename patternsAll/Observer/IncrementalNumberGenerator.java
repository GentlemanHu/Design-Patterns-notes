package Observer;

/**
 * IncrementalNumberGenerator
 */
public class IncrementalNumberGenerator extends NumberGenerator {
      private int init_number, step, final_number, number;

      public IncrementalNumberGenerator(int init_number, int final_number, int step) {
            this.init_number = init_number;
            this.step = step;
            this.final_number = final_number;
      }

      public int getNumber() {
            return number;
      }

      public void execute() {
            for (int i = init_number; i <= final_number; i += step) {
                  this.number = i;
                  notifyObservers();
            }
            
      }
}