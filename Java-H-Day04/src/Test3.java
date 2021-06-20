package Tompeixun;

import java.util.HashMap;

public class Test3 {
    public static void main(String[] args) {
        HashMap<String,String> map1=new HashMap<>();
        map1.put("kate","doctor");
        map1.put("Lily","lawyer");
        map1.put("Lily","lawyer");
        map1.put("Jimmy","professor");
        System.out.println(map1);
        map1.remove("Lily");
        System.out.println(map1);
        System.out.println(map1.get("kate"));
    }
}
