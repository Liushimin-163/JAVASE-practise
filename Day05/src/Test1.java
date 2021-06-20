public class Test1 {
    public static void main(String[] args) {

        System.out.println("兩個整數之和：" + getSum(7, 8));//Mac的快捷建注释和多行注释是？
        System.out.println("兩数之和：" + getSum(7, 8.0));
        System.out.println("兩數之和：" + getSum(6.0, 8));


    }

    public static int getSum(int num1, int num2) {
        return num1 + num2;

    }

    public static double getSum(int num1, double num2) {
        return num1 + num2;

    }

    public static double getSum(double num1, int num2) {
        return num1 + num2;
    }
}


