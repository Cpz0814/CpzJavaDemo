package Demo04_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class DemoInputStream02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fl=new FileInputStream("F:\\Git\\CPZ\\bbb\\sqsqs\\b.txt");
        byte[] bytes = new byte[1024];
        int len = 0;//记录每次读取得有效字节个数
        while ((len = fl.read(bytes))!=-1) {
            /*System.out.println(len);
            System.out.println(Arrays.toString(bytes));*/
            System.out.print(new String(bytes,0,len));
        }
        fl.close();
    }
}
