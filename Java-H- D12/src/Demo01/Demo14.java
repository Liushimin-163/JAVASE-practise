package Demo01;

import java.util.function.Function;

//present Function<T,R>'s andThen();2 functional object could use one method.
public class Demo14 {
    public static void andThenTest(Function<String, Integer> function1, Function<Integer, Integer> function2) {
        int value = function1.andThen(function2).apply("100");
        System.out.println(value);
    }

    public static void main(String[] args) {
        andThenTest((data)->{
            System.out.println(data);
            return Integer.valueOf(data)-50;
        },(data)->{
            System.out.println(data);
            return Integer.valueOf(data)+10;
        });
    }
}
