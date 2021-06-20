package BufferedDemo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//extract Order as key ,use Map.
public class Demo04  {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader("in.txt"));
        String line="";
        HashMap<String,String> map=new HashMap<>();
        while((line=bufferedReader.readLine())!=null){
        String[] str=line.split("\\.");
        map.put(str[0],str[1]);
        }
       // System.out.println(map);
       // System.out.println(str[0]);
       // System.out.println(str[1]);
        bufferedReader.close();
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("out.txt"));
        for(Map.Entry<String,String> item:map.entrySet()){
            bufferedWriter.write(item.getKey()+"."+item.getValue());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }
}
