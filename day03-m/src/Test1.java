public class Test1 {
    public static void main(String[] args) {
        int i=2;
        int i2=12;
        while(i<=10 && i2<=20){
            System.out.println("i:"+i+", i2:"+i2);
            i++;
            i2++;
            if(i==5 && i2==15){
                System.out.println("----------------------");
                continue;
            }
        }


    }
}
