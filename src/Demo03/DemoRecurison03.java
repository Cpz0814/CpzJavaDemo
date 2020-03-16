package Demo03;

import java.io.File;

public class DemoRecurison03 {
    public static void main(String[] args) {
        File file=new File("F:\\Git\\CPZ\\bbb");
        getAllFile(file);
    }
    public static void getAllFile(File dir){
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                getAllFile(file);
            }else {
                /*String name = file.getPath();
                boolean b = name.endsWith(".java");*/
                if (file.getName().toLowerCase().endsWith(".java")){
                    System.out.println(file);
                }
            }
        }
    }
}
