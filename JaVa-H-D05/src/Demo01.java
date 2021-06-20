public class Demo01 {
    public static void main(String[] args) {
        System.out.println("main thread is running...");
        ThreadDemo demo=new ThreadDemo("subThread");
        demo.start();
        for(int i=0;i<=10;i++){
            String mainStringName=Thread.currentThread().getName();
            System.out.println(mainStringName+"thread"+i);
        }
    }
}
