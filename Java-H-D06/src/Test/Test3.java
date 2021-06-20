package Test;

public class Test3 {
    public static void main(String[] args) {
       for(int i=0;i<=10;i++){ System.out.println(Thread.currentThread().getName()+i);}
        Apple a=new Apple();
        a.start();
        Pear p=new Pear();
      Thread pear =new Thread(p,"pear-");
       pear.start();
}}
class Apple extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }}
}
class Pear implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}