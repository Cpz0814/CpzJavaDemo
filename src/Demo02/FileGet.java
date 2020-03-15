package Demo02;

import java.io.File;

public class FileGet {
    public static void main(String[] args) {
        demo();
        System.out.println("==========");
        demo2();
        System.out.println("==========");
        demo3();
        System.out.println("==========");
        demo4();
    }

    private static void demo4() {
        //length()返回由此File表示的文件的长度
        //获取的是构造方法指定文件的大小，以字节为单位
        //注意：
        // 文件夹没有大小概念，不能获取文件夹的大小。如果路径不存在那么length返回0；
        File f = new File("F:\\HTMLDate\\CpzJavaDemo\\a.txt");
        long length = f.length();
        System.out.println(length);
    }

    private static void demo3() {
        //getName()：返回由此File表示的文件或目录的名称
        // 获取的是构造方法传递路径的结尾部分
        File f = new File("F:\\HTMLDate\\CpzJavaDemo\\a.txt");
        String name = f.getName();
        System.out.println(name);

        File f2 = new File("F:\\HTMLDate\\CpzJavaDemo");
        String name1 = f2.getName();
        System.out.println(name1);
    }

    private static void demo2() {
        //getPath()将此File转换为路径名字符串
        //获取的构造方法中传递的路径
        File f = new File("F:\\HTMLDate\\CpzJavaDemo\\a.txt");
        File f2 = new File("a.txt");
        String path = f.getPath();
        System.out.println(path);
        String path2 = f2.getPath();
        System.out.println(path2);
    }

    private static void demo() {
        //getAbsolutePath()获取绝对路径
        File f = new File("F:\\HTMLDate\\CpzJavaDemo\\a.txt");
        String absolutePath = f.getAbsolutePath();
        System.out.println(absolutePath);

        File f2 = new File("a.txt");
        String absolutePath1 = f2.getAbsolutePath();
        System.out.println(absolutePath1);
    }
}
