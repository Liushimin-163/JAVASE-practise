package Demo01;

import java.util.function.Function;

//Function <T,R>interface's apply(T,R) ;<T,R> T is get info,R return info
public class Demo13 {
    public static void applyTest(Function<String,Integer> function){
        int num=function.apply("100");
        num+=100;
        System.out.println(num);
    }

    public static void main(String[] args) {
        //applyTest((data)->data.length());
        applyTest((data)->Integer.valueOf(data));
    }
}
