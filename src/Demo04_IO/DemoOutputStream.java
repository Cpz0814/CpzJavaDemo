package Demo04_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * OutputStream:字节输出流
 * FileOutputStream文件字节输出流
 * 写入数据原理：
 * Java程序-->JVM(Java虚拟机)-->os(操作系统)-->so调用写数据的方法-->把数据写入到文件中
 */
public class DemoOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1=new FileOutputStream("F:\\Git\\CPZ\\bbb\\sqsqs\\a.txt");
        f1.write(94);
        f1.close();
    }
}
