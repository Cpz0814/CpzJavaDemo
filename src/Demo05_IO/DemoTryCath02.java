package Demo05_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoTryCath02 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("F:\\Git\\CPZ\\bbb\\ddd\\a.jpg");
             FileOutputStream fos = new FileOutputStream("F:\\Git\\CPZ\\bbb\\sws\\s.jpg")){
            byte[] bytes=new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
