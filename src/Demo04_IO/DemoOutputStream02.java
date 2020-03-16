package Demo04_IO;

import java.io.*;
import java.io.FileOutputStream;

public class DemoOutputStream02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1=new FileOutputStream("F:\\Git\\CPZ\\bbb\\sqsqs\\b.txt");
        f1.write(49);
        f1.write(48);
        f1.write(48);
        byte[] bytes={65,66,67,68,69};
        f1.write(bytes);
        String s = "你好";
        byte[] bytes1 = s.getBytes();
        f1.write(bytes1);
        f1.close();
    }
}
