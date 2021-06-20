public class Test10InvokeCalc {
    public static void main(String[] args) {
// TODO 请分别使用Lambda【标准格式】及【省略格式】调用invokeCalc方法来计算130-120的结果
     invokeCalc(130,120,(int a,int b)->{
         return a-b;

     });
        System.out.println("-----------");
        invokeCalc(130,120,(a,b)->a-b);
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.cal(a, b);
        System.out.println("结果是："+result);
    }


}