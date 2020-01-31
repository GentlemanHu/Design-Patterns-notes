package Adapter;

/**
 * Main
 */
public class Main {

      public static void main(String[] args) {
            FileIO f = new FileProperties();
            try {
                  // //f.readFromFile("file.txt");
                  // f.setValue("year", "2020");
                  // f.setValue("mouth", "4");
                  // f.setValue("day", "16");
                  // f.writeToFile("newfile2.txt");
                  //f.readFromFile("newfile.txt");
                  System.out.println(f.getAll("Adapter/newfile.txt"));

            } catch (Exception e) {
                  
            }
      }
}