package Test;

public class Test1 {
    //test1 start()是执行run的方法，run（）是方法体要重写
    //Test2 extends Thread 子类 ，重写run（）。
    // implement Runnable 重写接口对象，创建Runnable 实例创建Thread对象，可建立多个对象。
    //Test4 Runnable 的优势，可以多线共用一个方法体，创造多个实例实现方法，共享一个资源。避免单继承局限。2程序更加Robust，稳健性更高，可以方便代码更改。多个线程共享。
    // 只能实现Runnable或callable只能实现不能继承Thread的类
    //Test5 New 新建，Runnable 运行，但是实际运行要看cpu分配。Blocked 如果被其他线程抢到锁，则停止等待到时开放时重新抢锁。
    // Timed Waiting等待抢锁时间，到时间后或其他notify后重新抢锁和 无限期抢锁 waiting，等到其他线程notify后抢锁。
    //terminal 终止程序，要不完成run，要不捕捉到run异常。

}
