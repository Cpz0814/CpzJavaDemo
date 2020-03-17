package Demo04_IO;

import java.io.FileWriter;
import java.io.IOException;

public class DemoWriter02 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("a.txt");
        char[] cs = {'s','d','f','r'};
        writer.write(cs);
        //写入字符数组得某一部分，off数组的开始索引，len写的字符个数
        writer.write(cs,1,3);
        writer.write("陈鹏仔帅气");
        writer.write("才气逼人",0,2);
        writer.close();
    }
}
