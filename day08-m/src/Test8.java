
import java.util.Scanner;
public class Test8 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int c=sc.nextInt();
    String signal=sc.next();
    int a=sc.nextInt();
        System.out.println(c+signal+a+"="+count(c,signal,a));

    }

    public static String count(int c,String signal,int a) {
        int r=0;
        if("+".equals(signal)){
            r=c+a;
        }else if("-".equals(signal)){
            r=c-a;
        }else if("*".equals(signal)){
            r=c*a;
        }else if("/".equals(signal)){
            r=c/a;
        }else if("%".equals(signal)){
            r=c%a;
        }else{
            return null;
        }
        return r+"";
    }
}
