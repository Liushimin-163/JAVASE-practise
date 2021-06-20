package Demo03;
class Apple{

    private int count;

    public Apple(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
public class Demo03 {
    public static void main(String[] args) {
        Apple apple=new Apple(0);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (apple){
                        System.out.println(Thread.currentThread().getName()+" get the lock...");
                        if(apple.getCount()>0){
                            apple.setCount(0);

                            System.out.println(Thread.currentThread().getName()+" eat an apple.");
                            try{
                                Thread.currentThread().sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            apple.notify();
                        }else{
                            try {
                                System.out.println("Right now, there is no apples there");
                                apple.wait(500);

                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        },"Consumer").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (apple){
                        System.out.println(Thread.currentThread().getName()+" get the lock...");
                        if(apple.getCount()<=0){
                            apple.setCount(1);
                            System.out.println(Thread.currentThread().getName()+" produce an apple");
                            try{
                                Thread.currentThread().sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            apple.notify();
                        }else{
                            try{
                                System.out.println("It is already an apple there");
                                apple.wait(500);

                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        },"Producer").start();
    }
}
