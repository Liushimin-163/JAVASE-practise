
import javax.swing.*;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入大字符串:");
        String s=sc.next();
        System.out.println("请输入小字符串:");
        String k=sc.next();
        System.out.println("小字符串" +k+",在大字符串中共出现"+getCount(s,k)+"次");
    }

    public static int getCount(String s,String k) {
        int count=0;
        int i=0;
        while((i=s.indexOf(k,i))!=-1){//i更改成小字符串首字符出现位置了
            i++;
            count++;
        }
        return count;
    }
}
