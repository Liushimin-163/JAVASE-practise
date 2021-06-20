package Tompeixun;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        int[] arr={1,4,5,7,9};
        ArrayList <Integer> Num= listTest(arr);
        System.out.println(Num);
    }

    private static ArrayList<Integer> listTest(int[] arr) {
        ArrayList <Integer> Num=new ArrayList<Integer>();
        for(int i: arr){
            Num.add(i);
        }
        return Num;
    }

}
