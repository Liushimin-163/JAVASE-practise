package tompeixun;

import java.util.Properties;
import java.util.Set;

public class Demo06 {
    public static void main(String[] args) {
        Properties properties=new Properties();
        properties.setProperty("userName","Lily");
        properties.setProperty("age","18");
        properties.setProperty("gender","female");
        System.out.println(properties);
        System.out.println(properties.get("userName"));
        Set<String>  keySet=properties.stringPropertyNames();
        for(String k:keySet){
            System.out.println(k+"------"+properties.get(k));
        }
    }

}
