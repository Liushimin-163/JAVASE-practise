package Demo01;

import java.util.Arrays;
import java.util.function.Supplier;

//通过supplier<T>求数组最大值
public class Demo05 {
    public static int getMax(Supplier<Integer> supplier){
        return  supplier.get();
    }

    public static void main(String[] args) {
        int[] array={2,5,1,6,9,0};
        int maxValue=getMax(() -> {
            int max = array[0];
            for (int item : array) {
                if (item > max) {
                    max = item;

                }}
                return max;

        });
        System.out.println(Arrays.toString(array));
        System.out.println(maxValue);
    }
}
