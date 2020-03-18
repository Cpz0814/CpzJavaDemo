package Demo08_IO;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class DemoOutputStreamWriter {
    public static void main(String[] args) throws IOException{
        write_utf_8();
        write_gbk();
    }
    //使用转换流OutputStreamWriter写utf-8格式的文件
    private static void write_gbk()throws IOException {
        OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream("c.txt"),"gbk");
        ow.write("你好");
        ow.flush();
        ow.close();
    }

    //使用转换流OutputStreamWriter写utf-8格式的文件
    private static void write_utf_8() throws IOException {
        OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream("as.txt"),"utf-8");
        ow.write("你好");
        ow.flush();
        ow.close();
    }
}
