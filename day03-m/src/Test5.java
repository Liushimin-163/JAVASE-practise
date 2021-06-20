public class Test5 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int count=6;
        while(count>=0){
            for(int i=0;i<=12;i+=2){
                if(count%3==0){
                    a=i;
                    System.out.println(i+" Hello");
                }else{
                    b=i;
                    System.out.println(i+" World");
                }
                count--;
            }

        }
        System.out.println("a*b的值："+a+"*"+b+"="+a*b);
    }
}
