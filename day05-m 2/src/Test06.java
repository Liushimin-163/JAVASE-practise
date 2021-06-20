import java.util.Arrays;//引用外部library，使用Array.toString函数。
public class Test06 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,3,2,1};
        System.out.println(Arrays.toString(arr1)+"是否对称"+sym(arr1));
        int[] arr2={1,2,3,4,5,2,1};
        System.out.println(Arrays.toString(arr2)+"是否对称"+sym(arr2));
    }

    public static boolean sym(int[] arr) {
        for(int i=0;i<arr.length/2;i++){
            if (arr[i]!=arr[arr.length-1-i]){//不能用if arr【i】==arr【arr.length-1-i】return true。外面用return false
                return false;
            }
        }
        return true;
    }
}
