import java.util.*;

public class Demo {
    public static void main(String[] args) {

        HashMap<Student,String> list=new HashMap<Student,String>();
        list.put(new Student("lili",14),"上海");
        list.put(new Student("jack",15),"北京");
        list.put(new Student("jack",15),"广州");
        list.put(new Student("peky",15),"北京");
        Set<Student> person=list.keySet();
        for(Student s:person){
            System.out.print(s+":");
            System.out.print(list.get(s));
            System.out.println();
        }
        System.out.println("---------------");
        Set<Map.Entry<Student,String>> set=list.entrySet();
        for(Map.Entry<Student,String> entry:set){
            System.out.print(entry.getKey()+" ");
            System.out.print(entry.getValue());
            System.out.println();
        }
        System.out.println("-------------");
        LinkedHashMap <Student,String> linkList=new LinkedHashMap<>();
        linkList.put(new Student("Kate",17),"深圳");
        linkList.put(new Student("jack",15),"广州");
        linkList.put(new Student("Kate",17),"深圳");
        linkList.put(new Student("lili",14),"上海");
        System.out.println(linkList);
        System.out.println("---------------");
        System.out.println("请输入一串字符：");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character,Integer> hashMap=new HashMap<>();
       for(int i=0;i<str.length();i++){
           char c=str.charAt(i);
           if(!hashMap.containsKey(c)){
               hashMap.put(c,1);
           }else{
               Integer count=hashMap.get(c);
               count=count+1;
               hashMap.put(c,count);
           }

       }
        System.out.println(hashMap);
    }
}
