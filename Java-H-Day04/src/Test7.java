package Tompeixun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<String> pro=new ArrayList<>();
        ArrayList<String> cap=new ArrayList<>();
        Collections.addAll(pro,"黑龙江省","浙江省","江西省","广东省","福建省");
        Collections.addAll(cap,"哈尔滨","杭州","南昌","广州","福州");
        HashMap<String,String> map=new HashMap<>();
       for(int i=0;i<pro.size();i++){
           map.put(pro.get(i),cap.get(i));
       }
        System.out.println(map);
    }
}
