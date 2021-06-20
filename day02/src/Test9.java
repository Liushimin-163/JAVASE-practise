public class Test9 {
    public static void main(String[] args) {
        PrintNum();
    }

    public static void PrintNum() {
        String str="";
        int num=50;
        str=(num%2==0 ? "偶数":"奇数");
        System.out.println("num:"+num+"是"+str);


    }
}

