import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test8 {
    public static void main(String[] args) {
        ExecutorService s= Executors.newFixedThreadPool(2);
        MyRunnable m=new MyRunnable();
        Thread student=new Thread(m);
        student.start();
        s.submit(m);
        s.submit(m);
        s.submit(m);
        s.shutdown();
    }
}
