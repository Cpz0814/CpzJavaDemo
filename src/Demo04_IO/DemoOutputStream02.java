package Demo04_IO;

import java.io.*;
import java.io.FileOutputStream;
import java.util.Scanner;

public class DemoOutputStream02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1=new FileOutputStream("F:\\Git\\CPZ\\bbb\\sqsqs\\b.txt");
        /*f1.write(49);
        f1.write(48);
        f1.write(48);
        byte[] bytes={65,66,67,68,69};
        f1.write(bytes);*/
        System.out.println("请输入你要保存的字节");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        byte[] bytes1 = next.getBytes();
        f1.write(bytes1);
        f1.close();
    }
}
