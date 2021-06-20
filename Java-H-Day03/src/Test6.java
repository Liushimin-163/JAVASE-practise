package Tompeixun;

import java.util.HashSet;

public class Test6 {
    public static void main(String[] args) {
        HashSet<People> people= new HashSet<>();
        people.add(new People("Wei",22));
        people.add(new People("Wei",22));
        people.add(new People("goo",22));
        people.add(new People("goo",21));
        System.out.println(people);



    }
}
