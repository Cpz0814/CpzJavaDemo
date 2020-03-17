package Demo04_IO;

import java.io.*;

/*
文件字符输入流
把硬盘文件中的数据以字符得方式读取到内存中
 */
public class DemoReader {
    public static void main(String[] args) throws IOException {
        File files = new File("a.txt");
        FileReader file = new FileReader(files);
        char[] chars = new char[1024];
        int len = 0;
        while ((len = file.read(chars)) != -1){
            System.out.print(chars);
        }
        file.close();
    }
}
