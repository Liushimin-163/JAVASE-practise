package Tompeixun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LianXi {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList <String>();
        list.add("sji");
        Collections.addAll(list,"dgkr","dief","keos");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("-----------");
        ArrayList <Student> s= new ArrayList<Student>();
        s.add(new Student("mary",18));
        s.add(new Student("kate",19));
        Collections.addAll(s,new Student("Jimmy",17),new Student("Eve",18));
        System.out.println(s);
        System.out.println("----------");
        Collections.sort(s, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result=o2.getAge()-o1.getAge();
                if(result==0){
                    result=o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }

        });
        System.out.println(s);
}}
