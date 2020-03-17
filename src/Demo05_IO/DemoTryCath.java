package Demo05_IO;

import java.io.FileWriter;
import java.io.IOException;

public class DemoTryCath {
    public static void main(String[] args) {
        FileWriter writer =null;
        try {
            writer = new FileWriter("a.txt",true);
            for (int i = 0; i < 10; i++) {
                writer.write("鹏"+i+"\r\n");
            }
        }catch (IOException e){
            System.out.println(e);
        }finally {
            if (writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
