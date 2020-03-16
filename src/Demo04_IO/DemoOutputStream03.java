package Demo04_IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOutputStream03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1=new FileOutputStream("F:\\Git\\CPZ\\bbb\\sqsqs\\c.txt",true);
        for (int i = 0; i < 10; i++) {
            f1.write("你好".getBytes());
            f1.write("\r\n".getBytes());
        }
        f1.close();
    }
}
