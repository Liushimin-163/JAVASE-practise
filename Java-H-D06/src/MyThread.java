public class MyThread implements Runnable{
    private int ticket=10;
    Object lock=new Object();
    @Override
    public void run() {
        while(true){
            synchronized (lock){
                String name=Thread.currentThread().getName();
                if(ticket<=0){
                    System.out.println(name+"歇业了");
                    break;}else{
                    System.out.println(name+"正在卖"+ticket);
                    ticket--;
                }
                    try{
                        Thread.currentThread().sleep(500);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }



            }
        }
    }
}
