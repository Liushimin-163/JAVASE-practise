package Tompeixun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"张三","李四","王五","二丫","钱六","孙七");
        System.out.println(list);
       // list.set(3,"王小丫");
        //System.out.println(list);

        if(list.contains("二丫")){

                list.set(list.indexOf("二丫"),"王小丫");
            }

        System.out.println(list);
        list.add("张三");
        System.out.println(list);
    }
}
