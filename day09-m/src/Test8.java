import org.w3c.dom.ls.LSOutput;

public class Test8 {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Tom老师","Java");
        Student student=new Student("秦奋同学",100);
        teacher.show();
        student.show();
    }
}
class Person{
    private String name;


    public Person(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

class Teacher extends Person{

    String course="讲授Java课";
    public Teacher(String name, String course) {
        super(name);
        this.course=course;
    }
    public void show(){
        System.out.println(getName()+",讲授"+course+"课");
    }
}
class Student extends Person{
    int score;

    public Student(String name, int score) {
        super(name);
        this.score = score;
    }
    public void show(){
        System.out.println(getName()+"，考试得了"+score+"分");
    }
}

