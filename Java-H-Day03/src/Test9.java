package Tompeixun;

import java.util.ArrayList;
import java.util.Collections;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<Integer> i=new ArrayList<Integer>();
        i.add(33);
        i.add(11);
        i.add(77);
        i.add(55);
        System.out.println(i);
        Collections.sort(i);
        System.out.println(i);

    }
}
