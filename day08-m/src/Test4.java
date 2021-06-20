
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入源字符串:");
        String srcStr=sc.nextLine();
        System.out.println("请输入要删除的字符串:");
        String delStr=sc.nextLine();

        System.out.println("源字符串中总共包含："+getCount(srcStr,delStr)+"个"+delStr);
        String r=srcStr.replace(delStr,"");
        System.out.println("删除"+delStr+"后的字符串为："+r);
    }

    public static int getCount(String s,String d) {
       int count=0;
       int index=0;
       while((index=s.indexOf(d,index))!=-1){
           count++;
           index++;
       }
       return count;
    }
}
