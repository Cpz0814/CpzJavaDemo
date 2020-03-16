package Demo03;

import java.io.File;
import java.io.FilenameFilter;

public class DemoFiltes02 {
    public static void main(String[] args) {
        File file=new File("F:\\Git\\CPZ\\bbb");
        getAllFile(file);
    }
    //file过滤器listFiles()
    public static void getAllFile(File dir){
        System.out.println(dir);
        /*File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory()||
                        name.toLowerCase().endsWith(".java");
            }
        });*/
        
        //使用Lambda优化匿名内部类
        File[] files = dir.listFiles((dirs,name)->
                new File(dirs,name).isDirectory()||
                        name.toLowerCase().endsWith(".java"));

        for (File file : files) {
            if (file.isDirectory()){
                getAllFile(file);
            }else {
                System.out.println(file);
            }
        }
    }
}
