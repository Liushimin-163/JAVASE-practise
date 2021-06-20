package Tompeixun;

public class Test9 {
    public static void main(String[] args) {
        Manager m1=new Manager("James","9527",15000.0,3000.0);
        Coder c1=new Coder("Kobe","0025",10000.0);
        m1.intro();
        m1.showSalary();
        m1.work();
        System.out.println("==============");
        c1.intro();
        c1.showSalary();
        c1.work();
    }
}
