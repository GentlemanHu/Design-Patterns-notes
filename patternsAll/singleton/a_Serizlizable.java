package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * a_Serizlizable 反序列化破解单例
 */
public class a_Serizlizable {

      public static void main(String[] args) throws Exception {
            SingletonDemo2 s2 = SingletonDemo2.getInstance();

            System.out.println(s2);

            // 输出对象
            FileOutputStream fs = new FileOutputStream("./a.txt");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(s2);
            os.close();
            fs.close();

            ObjectInputStream oi = new ObjectInputStream(new FileInputStream("./a.txt"));
            SingletonDemo2 sb = (SingletonDemo2) oi.readObject();
            oi.close();
            System.out.println(sb);

            System.out.println("--------");

            // Demo5
            SingletonDemo5 s5 = SingletonDemo5.getInstance();
            System.out.println(s5);

            FileOutputStream f2 = new FileOutputStream("./b.txt");
            ObjectOutputStream os2 = new ObjectOutputStream(f2);
            os2.writeObject(s5);
            os2.close();
            f2.close();

            ObjectInputStream oi2 = new ObjectInputStream(new FileInputStream("./b.txt"));
            SingletonDemo5 sb2 = (SingletonDemo5) oi2.readObject();
            oi2.close();
            // 结果如下（因为修改成反-反序列化，现在运行不会成功）
            /*
             * singleton.SingletonDemo5@4d405ef7 
             * singleton.SingletonDemo5@433c675d
             */
            System.out.println(sb2);

      }
}