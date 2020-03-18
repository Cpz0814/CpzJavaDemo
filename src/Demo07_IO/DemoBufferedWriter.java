package Demo07_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/*
BufferedWriter字符缓冲输出流
 */
public class DemoBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("as.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("陈鹏仔");
            bw.newLine();//换行
        }

        bw.flush();
        bw.close();
    }
}
