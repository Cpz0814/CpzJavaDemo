package Demo02;

import java.io.File;

/*
    File类遍历（文件夹）目录功能
    list()：返回一个String数组，表示File目录中的所有子文件或目录
    listFiles():返回一个File数组，表示File目录中的所有子文件或目录
 */
public class DemoFileFor {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    private static void demo2() {
        File file=new File("F:\\Git\\CPZ\\bbb");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }

    private static void demo1() {
        File file=new File("F:\\Git\\CPZ\\bbb");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
