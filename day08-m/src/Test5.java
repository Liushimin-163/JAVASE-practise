
import java.util.Random;//Math里也包含随机数
import java.lang.Math;

public class Test5 {
    public static void main(String[] args) {
        double r=Math.random()*100;//Math里也包含随机数
        System.out.println("随机数为：");//如果四舍五入的话，有没有类似于round（r,2）
        // 之类的保留小数点2位的数呢
        System.out.println(r);
        String s=r+"";
        int i=s.indexOf(".");
        String x=s.substring(0,i+3);
        System.out.println("转换为");
        System.out.println(x);

    }


}
