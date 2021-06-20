package Demo01;

import java.util.function.Predicate;

public class Demo11 {
    public  static void andTest(Predicate<String> predicate1, Predicate<String>predicate2){
        String str="hello world";

        boolean result=predicate1.or(predicate2).test(str);//只有两个都是true，结果才为true
        System.out.println(result);
    }

    public static void main(String[] args) {
        andTest((data)-> data.length()<5
                ,(data)->{
                    boolean result=false;
                    for(char d:data.toCharArray()){
                        if('0'<d&&d<'9'){
                            result=true;
                            break;
                        }
                    }
                    return result;
                });
    }
}
