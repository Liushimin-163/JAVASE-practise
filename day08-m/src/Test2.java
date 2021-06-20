
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String qq = sc.next();

        boolean isOK = checkQQ(qq);

        System.out.println("这个QQ号码是否正确:" + isOK);
    }


    public static boolean checkQQ(String qq){

        if (qq.length()<5 || qq.length()>12 ) {
            return false;
        }

        if (qq.charAt(0) == '0') {
            return false;
        }

        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);

            if (ch<'0' || ch>'9') {//字符串也能比较大小？
                return false;
            }
        }

        return true;
    }
}
