public class Test01 {

        public static void main(String[] args) {//函数重载是指函数名相同，因为里面的参数不同的话，可以多次重复设定，
                                                // 在函数调用时可以依照给出参数类型，系统自动选择符合参数性质的函数进行调用。

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
