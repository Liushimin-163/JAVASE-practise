public class Test4 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        method1();
        method2();
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    public static void method2() {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
        System.out.println("----------");

    }

    public static void method1() {
        int a=5;
        int b=-a;
        System.out.println(-a);
        System.out.println(b);
        System.out.println("----------");
    }
}
