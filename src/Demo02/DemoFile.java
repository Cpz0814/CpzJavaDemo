package Demo02;

import java.io.File;

/*
file类，我们可以使用file类对文件和文件夹进行操作
我们可以使用file类的方法：
       创建一个文件/文件夹
       删除文件/文件夹
       获取文件/文件夹
       判断文件/文件夹是否存在
       对文件夹进行遍历
       获取文件夹大小
    file类是与系统无关的类，任何操作系统都可以使用这个类的方法
  重点记住三个单词：
       file：文件
       directory：文件夹/目录
       path：路径
 */
public class DemoFile {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符

        String separator = File.separator;
        System.out.println(separator);//文件名称分隔符


    }
}
