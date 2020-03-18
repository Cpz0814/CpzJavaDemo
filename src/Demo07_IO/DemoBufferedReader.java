package Demo07_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("as.txt"));
        /*char[] chars = new char[1024];
        int len = 0;
        while ((len=br.read(chars))!=-1){
            System.out.println(chars);
        }*/
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
