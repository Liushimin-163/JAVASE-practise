package Demo02;



public class Demo02 {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        Thread t1=new Thread(mt,"窗口1");
        Thread t2=new Thread(mt,"窗口2");
        Thread t3=new Thread(mt,"窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
