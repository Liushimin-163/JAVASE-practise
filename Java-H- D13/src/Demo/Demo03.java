package Demo;

import java.util.Arrays;

//方法使用场景，对象的放法（成员方法（父对象/自身的成员法法），构造方法）
//类的方法，类名，方法
//数组的构造方法
public class Demo03 {
    public static Person buildPerson(String name,PersonBuilder personBuilder){
        Person person=personBuilder.build(name);
        return person;
    }
    public static int[] arrayBuild(int len,ArrayBuilder arrayBuilder){
        int[] array=arrayBuilder.build(len);
        return array;
    }
    public static void main(String[] args) {
        Student student=new Student();
        student.show();
      Person person=buildPerson("zhangsan",(name->new Person(name)));
      Person person2=buildPerson("zhangsan2",Person::new);
        System.out.println(person);
        System.out.println(person2);
        int[] array2=arrayBuild(8,(len)->new int[len]);
        System.out.println("lambda:"+Arrays.toString(array2));
        int[] array=arrayBuild(10,int[]::new);
        System.out.println(Arrays.toString(array));
    }
}
