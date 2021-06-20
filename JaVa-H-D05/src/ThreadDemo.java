public class ThreadDemo extends Thread{
    public ThreadDemo() {
    }

    public ThreadDemo(String name) {
        super(name);
    }

    @Override
    public void run() {
        String threadName=Thread.currentThread().getName();
        System.out.println(threadName+"is running...");
        for(int i=0;i<10;i++){
            System.out.println(threadName+" "+i);
        }
    }
}
