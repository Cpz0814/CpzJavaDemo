package Demo07_IO;

import java.io.*;

/*
文件复制练习02 使用缓冲流复制文件可以大大的提高效率
 */
public class DemoCopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("F:\\Git\\CPZ\\bbb\\ddd\\a.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("F:\\Git\\CPZ\\bbb\\sws\\j.jpg");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] bytes=new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制完成,复制文件共耗时"+(e-s)+"毫秒");
    }
}
