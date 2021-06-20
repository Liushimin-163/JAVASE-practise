package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Test02 {
    public static void main(String[] args) {
        Function<ArrayList<Integer>,Integer> num1=(list)->{
            int sum=0;
            for(int i:list){
                sum+=i;
            }
            return sum/list.size();
        };
        Function<Map<String,Integer>,ArrayList<Integer>> num2=(array)->{
            ArrayList<Integer> list=new ArrayList<>();
            for(String s:array.keySet()){
                int i=array.get(s);
                list.add(i);
            }
            return list;
        };
        Map<String,Integer> map=new HashMap<>();
        map.put("岑小村",59);
        map.put("谷天洛",82);
        map.put("渣渣辉",98);
        map.put("蓝小月",65);
        map.put("皮几万",70);
     Integer avg=num2.andThen(num1).apply(map);
        System.out.println("学生平均成绩为："+avg);
    }
}
