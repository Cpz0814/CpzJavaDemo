package Demo04_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("F:\\Git\\CPZ\\bbb\\sqsqs\\b.txt");
        /*int read = f1.read();
        System.out.println(read);*/
        int len = 0;
        while ((len = f1.read())!=-1){
            System.out.print((char)len);
        }
        f1.close();
    }
}
