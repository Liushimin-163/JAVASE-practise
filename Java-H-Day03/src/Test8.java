package Tompeixun;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test8 {
    public static void main(String[] args) {
        LinkedHashSet<String> list =new LinkedHashSet<>();
        Collections.addAll(list,"王昭君","王昭君","杨贵妃","西施","貂蝉");
        //System.out.println(list);
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());


        }
        System.out.println("-------------");
        for(String s:list){
            System.out.print(s+", ");
        }
       // if(list.contains("西施")){
            //list.set(list.indexOf("西施"),"东施");
        //}
    }
}
