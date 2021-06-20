public class Test2 {
    public static void main(String[] args) {
        double discount=1;
        int price=550;
        if(price>=500) {
            discount=0.5;
            System.out.println("totalPrice:"+price);
            System.out.println("totalPrice的discount："+price*discount);
        }else {
            discount=0.7;
            System.out.println("totalPrice:"+price);
            System.out.println("totalPrice的discount："+price*discount);
        }
    }

}