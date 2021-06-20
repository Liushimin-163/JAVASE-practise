package Test;

public class Test02 {
    static void getProduct(int a,int b,IntCalc calc){
        int result=calc.calc(a,b);
        System.out.println(result);
    }

    public static void main(String[] args) {
        getProduct(5,6,(a,b)->a*b
        );
    }
}
