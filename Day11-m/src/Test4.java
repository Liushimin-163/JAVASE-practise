import org.w3c.dom.ls.LSOutput;

public class Test4 {
    public static void main(String[] args) {
        Worker worker=new Worker();
        Apple a1=new Apple(5,"青色");
        Apple a2=new Apple(3,"红色");
        System.out.println("默认挑最大的：");

        Apple apple=worker.pickApple(new Com(),a1,a2);//这个new Com（）实行不了啊，CompareAble 在这个里也创建不了对象
        System.out.println(apple);
        System.out.println("挑红的");
        Apple Apple1=worker.pickApple(new Com(){
            public Apple compare(Apple a1, Apple a2) {
                Apple apple3 = "红色".equals(a1.getColor()) ? a1 : a2;
                return apple3;

        }},a1, a2);//这个运行直问题


                System.out.println(Apple1);

}
}
class Worker{
    public Apple pickApple(CompareAble c,Apple apple1,Apple apple2){//插口也能创建对象 c。
        Apple compare=c.compare(apple1,apple2);
        return compare;
    }

}

interface CompareAble{
    public default Apple compare(Apple a1, Apple a2){
        return (a1.getSize()>a2.getSize() ? a1:a2);}

}
class Com implements CompareAble{

}


