package tompeixun;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();
        System.out.println("回文数:"+isP(ch));

    }

    public static boolean isP(String ch) {
        boolean p=true;
        int start=0;
        int end=ch.length()-1;
        while(start<end){
            if(ch.charAt(start)!=ch.charAt(end)){
                p=false;
            }
            start++;
            end--;
        }
        return p;

    }
}
