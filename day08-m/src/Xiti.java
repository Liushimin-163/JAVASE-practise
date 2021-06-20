
import java.util.Arrays;
import java.lang.Math;
public class Xiti {
    //基本类型==先判断储存位置是不是一致。equals（）引用类型判断引用的位置中的值是否相等。
    public static void main(String[] args) {
        int [] arr={1,2,3};
        String s=arrayToString(arr);
        System.out.println("s:"+s);
        String line="nnidwpdirj[IIJkemfI";
        char[] chars=line.toCharArray();
        Arrays.sort(chars);
        for(int i=chars.length-1;i>=0;i--){
            System.out.print(chars[i]+" ");

        }
        double min=-10.8;
        double max=5.9;
        int count=0;
        for(double i=Math.ceil(min);i<=max;i++){
            if(Math.abs(i)>6||Math.abs(i)<2.1){
                count++;

            }
        }
        System.out.println();
        System.out.println("个数"+count);
    }

    public static String arrayToString(int[] arr) {
     String s=new String("[");
     for(int i=0;i<arr.length;i++){
         if(i==arr.length-1){
             s=s.concat(arr[i]+"]");

         }else{
             s=s.concat(arr[i]+"#");

         }
     }
     return s;
    }
}
