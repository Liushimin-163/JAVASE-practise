package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Test03 {
    //数组用，Of（） ，双列数组用keySet（）/valueSet().stream（）;集合直接用Stream（）获取值
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Stream<String> stream=list.stream();
        Set<String> set=new HashSet<>();
        Stream<String>  stream1=set.stream();
        HashMap<String,String> map=new HashMap<>();
        Stream<String> stream2_key=map.keySet().stream();
        Stream<String> stream2_value=map.values().stream();
        String[] array={"Java","C#","Python","c++","html","css","sql"};
        Stream.of(array)
                //streams.forEach(name-> System.out.println(name));
                .filter(key->key.length()<5)
                .skip(3)
                .forEach(str-> System.out.println(str));
        // System.out.println(count);
        //.forEach(name-> System.out.println(name));
        String[] array1={"12","20","30"};
        Stream.of(array1).map(str->Integer.valueOf(str))
                .forEach(key-> System.out.println(key));
        System.out.println("---------------");
        Stream<String> str1=Stream.of(array);
        Stream<String> str2=Stream.of(array1);
        Stream<String> str3=Stream.concat(str1,str2);
        str3.forEach(key-> System.out.println(key));



    }
}
