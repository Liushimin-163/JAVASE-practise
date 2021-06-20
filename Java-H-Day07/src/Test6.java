public class Test6 {
    public int start = 1;
    public int end = 99;
    public static void main (String[] args) {
        new Test6().method();
    }
    public void method() {
Runnable a=()->{
    for (int i=start;i<=end;i++){
        System.out.println(i);
    }
};
        Thread t = new Thread(a);
        t.start();
    }
}