package Demo02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread implements Runnable{
    private int ticket=10;
    Lock l=new ReentrantLock();
    @Override
    public void run() {
      while(true){
          l.lock();
          String name=Thread.currentThread().getName();
          if(ticket<=0){
              System.out.println(name+"歇业了");
              l.unlock();
              break;
           }
          else{
              System.out.println(name+"正在卖"+ticket);
              ticket--;
              l.unlock();
          }
          try{
              Thread.currentThread().sleep(500);
          }catch(InterruptedException e){
              e.printStackTrace();
          }
          //l.unlock();放在这里只有一个窗口抢得到票。
      }
    }
}
