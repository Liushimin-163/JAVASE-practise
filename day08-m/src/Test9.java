package tompeixun;
import java.util.Scanner;
public class Test9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        boolean k=checkCode(s);
        System.out.println(s+" 密码是否合法:"+k);

    }

    public static boolean checkCode(String s) {
        int count=0;
        if(s.length()<=8){
            return false;
        }
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
              count++;
          }if((s.charAt(i) < '0'|| s.charAt(i)>'9') && (s.charAt(i) < 'A'|| s.charAt(i)>'Z')&&(s.charAt(i) < 'a'|| s.charAt(i)>'z')) {

                return false;
        }

    }
        if(count<2){
        return false;}
        return true;
    }
}
