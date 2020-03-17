package Demo04_IO;

import java.io.FileWriter;
import java.io.IOException;
/*
Writer续写与换行(\r\n)
 */
public class DemoWriter03 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("a.txt",true);
        for (int i = 0; i < 10; i++) {
            writer.write("陈"+i+"\r\n");
        }
        writer.close();
    }
}
