import java.util.ArrayList;
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> s=new ArrayList<>();
        Student s1=new Student("小红","");
        Student s2=new Student("小亮","");
        Student s3=new Student("小明","");
        Teacher t=new Teacher("张老师");
        t.checkAb(s3);
        s.add(s1);
        s.add(s2);
        s.add(s3);
        Course c=new Course("Java",t,s);
        c.show(t,s);

    }
}
