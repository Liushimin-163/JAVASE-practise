package Demo;


import java.util.ArrayList;

import static java.util.Locale.filter;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("java");
        list.add("C#");
        list.add("Js");
        list.add("python");
        list.add("Javascript");
        list.stream().filter(s->s.startsWith("J"))
                      .filter(s->s.length()<5)
                      .forEach(System.out::println);
    }

}
