package Demo07_IO;

import java.io.*;
import java.util.HashMap;

public class DemoText {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("F:\\Git\\CPZ\\bbb\\sqsqs\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\Git\\CPZ\\bbb\\sqsqs\\b.txt"));
        String line;
        while ((line=br.readLine())!=null){
            String[] arr = line.split("\\.");//分割
            map.put(arr[0],arr[1]);
        }
        for (String key : map.keySet()) {
            String value = map.get(key);
            line = key+","+value;
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
