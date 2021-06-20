public class Test01 {

    //Test01 父类是java.lang.Throwable.子类java.lang.Error和java.util.Exception.Exception有编译异常Exception和RuntimeException
    //Test02（Error）是系统错误，是不能够出现的，不可弥补。
    //Test03（Exception）包括编译错误和runtime错误，可以用try catch修正和throw 抛出显示给别人看，可放在日志中。可修复的异常，用代码修复。
    //Test04 RunTimeException是指运行时错误可以不用throw和try catch也能进行正常编译不会报错。但是运行时出现报错，会不明白是什么原因。
    //Test05 throws 通常是在描述类中的，继承何种Exception时使用，throw通常是方法体中，抛出异常情况。并且在抛出后不进行后续程序。
    //Test06 区别throws 在声明方法中（描述方法）描述可能发出的异常，多个异常可以用，号隔开。如果发生异常，可以抛会给方法调用处。
    //Test07 异常处理，一个是throws，一个是try。。catch。。finally。。
    //Test08 throws就是抛出异常，放到日志中，并且在运行中体现发生何种异常，并暂停实行接下来的程序，try。。catch..finally 处理异常，不影响后续程序运行
    //try 试运行可能出现的程序。catch，遇到异常，进行处理，finally，无论发生什么异常都要执行的代码
    //Test09 IndexOutOfBoundsException 超过范围发生异常
    //NullPointException 空指针异常，需要null做其他处理时处理不用
    //Test10 出现NullPointException异常。
   //Test11 ArrayIndexOutOfBoundsException数组超过范围发生异常
 //Test12 ArithmeticException:/by zero 运算异常
    //Test13NumberFormatException 数组格式异常
    //Test14 输出"程序正常"
    //Test15 多个程序同一时刻进行。并发。在非常短的时间內轮流执行程序
    //Test16 进程是程序正在内存中运行中，线程是进程的一个单位，一段代码运行完。进程有多个线程运行。线程全部运行完，进程也完成了。
    // 一个进程包含多个线程。至少包含一个线程。



}

