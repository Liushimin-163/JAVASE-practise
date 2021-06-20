package Demo01;

import java.util.function.Supplier;

public class Demo04 {
    public static void log(int level, Supplier<String> logInterface){
        //present Supplier Function interface,延迟加载优化
        if(level==1){
            System.out.println("普通日志"+logInterface.get());
        }
        else if(level==2){
            System.out.println("参数问题"+logInterface.get());
        }else if(level==3){
            System.out.println("运行异常"+logInterface.get());
        }
    }
    public static void main(String[] args) {
        String className=Demo01.class.getName();
        String methodName="main";
        String info="test";
        //正常情况
        log(2, ()-> {

            System.out.println("init function was runned");
            return className+methodName+info;

        });
    }
}
