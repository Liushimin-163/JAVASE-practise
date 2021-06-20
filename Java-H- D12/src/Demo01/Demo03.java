package Demo01;

public class Demo03 {
    public static void log(int level,LogInterface logInterface){
        //log 写日志方法
        //level（异常登记，1，普通日志2：参数问题3：运行异常）
        //msg 日志描述
        if(level==1){
            System.out.println("普通日志"+logInterface.initInfo());
        }
        else if(level==2){
            System.out.println("参数问题"+logInterface.initInfo());
        }else if(level==3){
            System.out.println("运行异常"+logInterface.initInfo());
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
