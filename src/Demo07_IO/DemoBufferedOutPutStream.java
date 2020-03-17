package Demo07_IO;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
BufferedOutputStream字节缓冲输出流
 */
public class DemoBufferedOutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("as.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("陈鹏仔".getBytes());
        bos.close();
    }
}
