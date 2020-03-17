package Demo04_IO;

import java.io.FileWriter;
import java.io.IOException;

/*
字符输出流
 */
public class DemoWriter {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("a.txt");
        String s = "李白";
        writer.write(s);
        //flush:刷新缓冲区，流对象可以继续使用
        writer.flush();

        writer.write("陈");
        //close:先刷新缓冲区，然后通知系统释放资源，流对象不可以再被使用了。
        writer.close();
        //close后流已经被关闭不可以使用了
        //writer.write("鹏");
    }

}
