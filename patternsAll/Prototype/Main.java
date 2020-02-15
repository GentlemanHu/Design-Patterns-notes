package Prototype;

import Prototype.framework.*;

/**
 * Main
 */
public class Main {

      public static void main(String[] args) {
            Manager manager = new Manager();
            UnderlinePen upen = new UnderlinePen('~');
            MessageBox mBox = new MessageBox('*');
            MessageBox sBox = new MessageBox('-');
            manager.register("Strong Message", upen);
            manager.register("Warning Box", mBox);
            manager.register("Slash Box", sBox);

            Product p1 = manager.create("Strong Message");
            Product p2 = manager.create("Warning Box");
            Product p3 = manager.create("Slash Box");

            p1.use("Hello World");
            p2.use("Hello World");
            p3.use("Hello World");

      }
}