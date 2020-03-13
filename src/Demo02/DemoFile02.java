package Demo02;

import java.io.File;

public class DemoFile02 {
    public static void main(String[] args) {
//        show01();
//        show02("D:\\","a.txt");
        show03();
    }

    private static void show03() {
        File parent=new File("c:\\");
        File file=new File(parent,"hello.java");
        System.out.println(file);
    }

    private static void show02(String parent,String child) {
        File file = new File(parent,child);
        System.out.println(file);
    }

    private static void show01(){
        File fi=new File("E:\\1111\\a.txt");
        System.out.println(fi);

        File fe=new File("E:\\1111\\66666");
        System.out.println(fe);

        File fw=new File("a.txt");
        System.out.println(fw);

    }
}
