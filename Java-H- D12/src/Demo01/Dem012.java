package Demo01;

import java.util.function.Predicate;
//present Predictor's negate function
public class Dem012 {
    public  static void negateTest(Predicate<String> predicate){
        String str="hello world";
        System.out.println(predicate.test(str)+" length>5");
       boolean result=predicate.negate().test(str);
        System.out.println(result+" length<5");
    }

    public static void main(String[] args) {
        negateTest((data)-> data.length()>5);
    }
}
