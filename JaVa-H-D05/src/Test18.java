public class Test18 {
    public static void main(String[] args) {
        SubThread s=new SubThread("subThread");
        s.start();
        for(int i=1;i<=100;i++){
            if(i%2==1){
                System.out.println(Thread.currentThread().getName()+"thread:"+i);
            }
        }
    }
}
