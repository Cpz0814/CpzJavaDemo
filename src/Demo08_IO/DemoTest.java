package Demo08_IO;

import java.io.*;
/*
    练习：转换文件编码
        将GBK文本文件，转换为UTF-8的文本文件
 */
public class DemoTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("c.txt"),"GBK");
        OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream("as.txt"),"utf-8");
        char[] chars = new char[1024];
        int len = 0;
        while ((len=isr.read(chars))!=-1){
            System.out.println(chars);
            ow.write(chars);
        }
        ow.flush();
        ow.close();
        isr.close();
    }
}
