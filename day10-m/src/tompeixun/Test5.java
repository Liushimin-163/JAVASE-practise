package tompeixun;

public class Test5 {
    public static void main(String[] args) {
       Father a=new A();
       Father b=new B();
       a.show();
       b.show();

    }
}
interface Father{
    void show();
}
class A implements Father{
    @Override
    public void show() {
        System.out.println("AAAA");
    }
}
class B implements Father{
    @Override
    public void show() {
        System.out.println("BBBB");
    }
}
