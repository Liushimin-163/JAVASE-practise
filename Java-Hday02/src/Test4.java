package Tompeixun;

import java.util.ArrayList;
import java.util.Collection;


public class Test4 {
    public static void main(String[] args) {
        Collection arr= new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        arr.add(9);
        arr.add(11);
        arr.add(17);
        Object[] arr1=arr.toArray();
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }


}
