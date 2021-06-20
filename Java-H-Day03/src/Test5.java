package Tompeixun;

import java.util.LinkedList;

public class Test5 {
    public static void main(String[] args) {
        LinkedList<String> s=new LinkedList<>();
        s.add("Soda");
        s.add("Soda");
        s.add("Sunny");
        s.add("Summer");
        s.add(2,"Sunday");
        System.out.println(s);
        s.set(0,"Sample");
        System.out.println(s);
        System.out.println(s.remove(1));
        System.out.println(s);
        for(String str:s){
            System.out.println(str);
        }
        System.out.println("-------------");
        System.out.println(s.get(1));
        System.out.println(s.size());
        System.out.println("--------------");
        s.clear();
        System.out.println(s);
        System.out.println("------------");
        LinkedList <String> star=new LinkedList<>();
        star.add("Mar");
        star.add("Tur");
        star.add("Mon");
        star.add("Fri");
        star.addFirst("Tue");
        star.addLast("Sun");
        System.out.println(star);
        System.out.println(star.getFirst());
        System.out.println(star.getLast());
        System.out.println("-------------");
        String zero=star.removeFirst();
        System.out.println(zero);
        System.out.println(star);
        System.out.println("-------------");
        String last= star.removeLast();
        System.out.println(last);
        System.out.println(star);
        System.out.println("--------------");
        String pop=star.pop();
        System.out.println(pop);
        System.out.println(star);
        System.out.println("---------------");
        star.push("Sat");
        System.out.println(star);


    }
}
