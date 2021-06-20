public class Test6 {
    public static void main(String[] args) {

   C c= new C();
   c.showA();
   c.showB();
   c.showC();
    }

}
abstract class A{
    int numa=10;

}
abstract class B extends A{
    int numb=20;

}
class C extends B{
    int numc=30;
    public void showA(){
        System.out.println("A类中的numa："+numa);
    }
    public void showB(){
        System.out.println("B类中的numb："+numb);
    }
    public void showC(){
        System.out.println("C类中的numc："+numc);
    }
}


