package Tompeixun;

import java.util.ArrayList;
import java.util.Collection;

public class Test6 {
    public static void main(String[] args) {
        Collection<String> arr=new ArrayList<String>();
        //arr.add("great");
        //arr.add("scrap");
        //arr.add("jobs");
        //arr.add("lesli");
        System.out.println(listTest(arr));
    }

    private static boolean listTest(Collection<String> arr) {
        if(arr.isEmpty()){
            return true;
        }
        return false;
    }
}
