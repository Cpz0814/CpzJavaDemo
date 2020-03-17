package Demo07_IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/*
BufferedInputStream字节输入流缓冲区
 */
public class DemoBufferedInPutStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("as.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
    }
}
