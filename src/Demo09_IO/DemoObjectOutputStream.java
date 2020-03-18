package Demo09_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
    对象序列化流：
        把对象以流的方式写入到文件中保存
 */
public class DemoObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\Git\\as.txt"));
        oos.writeObject(new Person("李白",20));
        oos.close();
    }
}
