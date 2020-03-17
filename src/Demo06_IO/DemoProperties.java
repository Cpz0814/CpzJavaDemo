package Demo06_IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class DemoProperties {
    public static void main(String[] args) throws IOException {
        //show01();
        //show02();
        show03();
    }
    //Properties中的load()方法可以读取文件中的集合数据
    private static void show03() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("a.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println("key"+key+",value"+value);
        }
    }

    //Properties中的store()方法能把集合中的临时数据，持久写入到硬盘中储存
    private static void show02() throws IOException {
        Properties prop = new Properties();
        //setProperty往集合中添加数据
        prop.setProperty("李白","175");
        prop.setProperty("杜甫","170");
        prop.setProperty("苏轼","165");
        //创建字节输出流
        FileWriter fw = new FileWriter("a.txt");
        //把集合中的临时数据持久写入到硬盘中存储
        prop.store(fw,"save data");

        fw.close();
    }

    //Properties集合储存数据，遍历取出Properties集合中的数据
    private static void show01() {
        Properties properties = new Properties();
        //setProperty往集合中添加数据
        properties.setProperty("李白","175");
        properties.setProperty("杜甫","170");
        properties.setProperty("苏轼","165");
        //使用stringPropertyNames把Properties集合中的键取出，储存到一个Set集合中
        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            String value = properties.getProperty(key);
            System.out.println("key:"+key+",value:"+value);
        }
    }
}
