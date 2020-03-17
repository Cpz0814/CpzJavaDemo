package Demo04_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
文件复制练习
 */
public class DemoCopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("F:\\Git\\CPZ\\bbb\\ddd\\a.jpg");
        FileOutputStream fos = new FileOutputStream("F:\\Git\\CPZ\\bbb\\sws\\c.jpg");
        byte[] bytes=new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制完成,复制文件共耗时"+(e-s)+"毫秒");
    }
}
