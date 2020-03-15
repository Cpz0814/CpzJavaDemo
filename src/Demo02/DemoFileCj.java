package Demo02;

import java.io.File;
import java.io.IOException;

public class DemoFileCj {
    public static void main(String[] args) throws IOException {
        //show();
        //show2();
        show3();
    }

    private static void show3() {
        //delete():删除由此File表示的文件或者文件夹
        //此方法删除不走回收站
        File f1=new File("F:\\Git\\CPZ\\aaa");
        boolean delete = f1.delete();
        System.out.println(delete);
    }

    private static void show2() {
        //mkdir()：创建单级文件夹
        //mkdirs():既可以创建单级文件夹也可以创建多级文件夹
        //只能创建文件夹，不能创建文件
        //构造方法中给出的路径不存在返回false
        File f1=new File("F:\\Git\\CPZ\\aaa");
        boolean mkdir = f1.mkdir();
        System.out.println(mkdir);

        File f2=new File("F:\\Git\\CPZ\\bbb\\ddd\\fff");
        boolean mkdirs = f2.mkdirs();
        System.out.println(mkdirs);
    }

    private static void show() throws IOException {
        //createNewFile:当且仅具有该文件名称尚不存在，创建一个新文件夹
        //如果文件存在就返回false且不创建文件
        //如果文件不存在就返回true且创建文件
        //次方法只能创建文件不可创建文件夹，创建文件的路径必须存在否则会抛出异常
        File f1 = new File("F:\\HTMLDate\\CpzJavaDemo\\as.txt");
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);
    }
}
