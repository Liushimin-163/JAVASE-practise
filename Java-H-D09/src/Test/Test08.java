package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test08 {
    public static void main(String[] args) throws IOException {
        //Properties properties=new Properties();如何将建立的Properties 放入txt文件？
        //properties.setProperty("zhangsan","90");
        //properties.setProperty("lisi","80");
       // properties.setProperty("wangwu","85");

        //System.out.println(properties);
        Properties pro=new Properties();
        pro.load(new FileInputStream("score.txt"));
        Set<String> set=pro.stringPropertyNames();
        for(String s:set){
            if(s.equals("lisi")){
                pro.setProperty(s,"100");
            }
        }



    }
}
