package Demo02;

import java.io.File;

public class DemoFilePd {
    public static void main(String[] args) {
        show01();
        System.out.println("===========");
        show02();
    }

    private static void show02() {
        //isDirectory()用于判断构造方法中给定的路径是否以文件夹结尾
        File f1=new File("F:\\HTMLDate\\CpzJavaDemo\\a.txt");
        System.out.println(f1.isDirectory());

        File f2=new File("F:\\HTMLDate\\CpzJavaDemo");
        System.out.println(f2.isDirectory());

        //isFile()用于判断构造方法中是否以文件结尾，是否为文件
        if (f1.exists()){
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }
    }

    private static void show01() {
        //exists()判断File表示的文件或目录是否存在
        File f1=new File("F:\\HTMLDate\\CpzJavaDemo\\a.txt");
        System.out.println(f1.exists());

        File f2=new File("a.txt");
        System.out.println(f2.exists());

        File f3=new File("F:\\HTMLDate\\CpzJavaDemo\\as.txt");
        System.out.println(f3.exists());
    }
}
