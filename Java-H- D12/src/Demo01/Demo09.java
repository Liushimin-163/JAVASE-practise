package Demo01;

import java.util.function.Predicate;

public class Demo09 {
    public static void testStr(Predicate<String> predicate){
        String str="hello world";
        System.out.println("Is this string’s length longer than 5 bytes: "+predicate.test(str));
    }

    public static void main(String[] args) {
        testStr((data)->data.length()>5);
    }
}
