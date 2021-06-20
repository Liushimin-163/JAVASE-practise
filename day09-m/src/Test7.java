public class Test7 {
    public static void main(String[] args) {
        Duck duck=new Duck("鸭子",2,"感冒","发烧");
        duck.show();

    }
}
abstract class Animal{
   private String name;
   private int age;
   private String r;
   private String sym;

    public Animal() {
        super();
    }

    public Animal(String name, int age, String r, String sym) {
        this.name = name;
        this.age = age;
        this.r = r;
        this.sym = sym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIll() {
        return r;
    }

    public void setIll(String ill) {
        this.r = ill;
    }

    public String getSym() {
        return sym;
    }

    public void setSym(String sym) {
        this.sym = sym;
    }
}
class Duck extends Animal{


    public Duck(String name, int age, String r, String sym) {
        super(name,age,r,sym);

    }

    public void show(){
        System.out.println("动物种类："+getName()+"，年龄"+getAge()+"岁");
        System.out.println("入院原因："+getIll());
        System.out.println("症状为："+getSym());
    }
}