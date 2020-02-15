package builder.nBuilder;

import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        if (args.length !=1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("PLAIN")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        }
        else if (args[0].equals("HTML")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String result = htmlBuilder.getResult();
            System.out.println(result+"Write Complete!");
        }else {
            usage();
            //command();
            System.exit(0);
        }
    }
    
    public static void usage() {
        System.out.println("Usage: java Main PLAIN     编写纯文本文档");
        System.out.println("Usage: java Main HTML      编写HTML文档");
    }

    public static void command() {
        Scanner scanner = new Scanner(System.in);

    }
}