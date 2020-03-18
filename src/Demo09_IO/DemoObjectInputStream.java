package Demo09_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/*
    对象的反序列化流
        把文件中保存的对象以流的方式读取出来使用
 */
public class DemoObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("as.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
        Person person = (Person) o;
        System.out.println(person.getName());
    }
}
