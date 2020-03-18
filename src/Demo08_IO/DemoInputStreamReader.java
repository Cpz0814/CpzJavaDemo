package Demo08_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoInputStreamReader {
    public static void main(String[] args) throws IOException {
        //read_gbk();
        read_utf_8();
    }

    private static void read_utf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("as.txt"),"utf-8");
        int len = 0;
        while ((len=isr.read())!=-1){
            System.out.println((char) len);
        }
        isr.close();
    }

    //使用InputStreamReader读取GBK格式的文件
    private static void read_gbk() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("c.txt"),"gbk");
        int len = 0;
        while ((len=isr.read())!=-1){
            System.out.println((char) len);
        }
        isr.close();
    }
}
