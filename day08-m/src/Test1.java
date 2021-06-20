
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("录入:");
        String s=scanner.next();
        System.out.println("录入的字符串"+s);
        char[] ch=s.toCharArray();
        String k="";
        for(int i=s.length()-1;i>=0;i--){

            k+=ch[i];
        }
        System.out.println("反转的字符串:"+k);
    }
}
