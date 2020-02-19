/*
 * @Author: Gentleman.Hu 
 * @Date: 2020-02-19 19:57:10 
 * @Last Modified by: Gentleman.Hu
 * @Last Modified time: 2020-02-19 20:00:04
 */
package Flyweight;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            // 需要自造的字体文本
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 123123");
            System.exit(0);
        }

        BigString bs = new BigString(args[0]);
        bs.print();
    }
}