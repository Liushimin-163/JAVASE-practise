package tompeixun;

public class Test7 {
    public static void main(String[] args) {
        AAA b=new BB();
        b.showA();
        AAA.showB();
        AAA c=new CC();
        c.showA();
        AAA.showC();//为什么c.showC()会报错呢，明明在AAA中写了showC（），且c 是AAA类里的
        DD d=new DD();
        d.showA();

    }
}
interface AAA{
    void showA();

    public static void showB() {
        show10("BBBB");
    }
    public static void showC(){
        show10("CCCC");
    }
    private static void show10(String s){
        for(int i=0;i<10;i++){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
class BB implements AAA{
    @Override
    public void showA() {
        System.out.println("static B");
    }


}
class CC implements AAA{
    @Override
    public void showA() {
        System.out.println("static C");

    }
}
class DD implements AAA{
    @Override
    public void showA() {
        System.out.println("AAA");
        System.out.println("DDDD");
    }
}
