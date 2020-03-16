package Demo03;

import java.io.File;

public class DemoFiltes {
    public static void main(String[] args) {
        File file=new File("F:\\Git\\CPZ\\bbb");
        getAllFile(file);
    }
    //file过滤器listFiles()
    public static void getAllFile(File dir){
        System.out.println(dir);
        File[] files = dir.listFiles(new FileFilterImpl());
        for (File file : files) {
            if (file.isDirectory()){
                getAllFile(file);
            }else {
                System.out.println(file);
            }
        }
    }
}
