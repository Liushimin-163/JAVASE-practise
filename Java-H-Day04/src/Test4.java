package Tompeixun;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test4 {
    public static void main(String[] args) {
        HashMap<String,String> map2=new HashMap<>();
        map2.put("kate","doctor");
        map2.put("Lily","lawyer");
        map2.put("Lily","lawyer");
        map2.put("Jimmy","professor");
        Collection<String> str=map2.values();

        for(String s:str){
            System.out.println(s);
        }
        System.out.println("------------");
        Iterator<String> it=str.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
