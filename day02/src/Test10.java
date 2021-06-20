public class Test10 {

    public static void main(String[] args) {

        add();
        sub();
        mul();
        div();
        remain();
    }

    public static void add() {
        int x=100;
        int y=200;
        int r1=x+y;
        System.out.println("x,y的和为："+r1);

    }

    public static void sub() {
        int x=100;
        int y=200;
        int r2=x-y;
        System.out.println("x,y的差为："+r2);

    }

    public static void mul() {
        int x=100;
        int y=200;
        int r3=x*y;
        System.out.println("x,y的积为："+r3);

    }

    public static void div() {
        int x=100;
        int y=200;
        int r4=x/y;
        System.out.println("x,y的商为："+r4);

    }

    public static void remain() {
        int x=100;
        int y=200;
        int r5=x%y;
        System.out.println("x,y的余数为："+r5);

    }
}
