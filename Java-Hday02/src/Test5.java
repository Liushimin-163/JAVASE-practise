package Tompeixun;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("great");
        arr.add("scrap");
        arr.add("jobs");
        arr.add("lesli");
        System.out.println(listTest(arr,"jobs"));
    }

    private static boolean listTest(ArrayList<String> arr, String s) {
        if(arr.contains(s)){
            return true;
        }
        return false;
    }
}

