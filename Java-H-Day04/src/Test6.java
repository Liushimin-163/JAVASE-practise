package Tompeixun;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        //将序号和对应人名打印
        Set<Integer> order=map.keySet();
        for(Integer n:order){
            System.out.print(n+": "+map.get(n));
            System.out.println();
        }
        map.put(5,"李晓红");//插入新名字
        //移除制定key内容
        map.remove(1);
        //将指定key修改信息
        map.put(2,"周林");
        //System.out.println(map);

    }
}
