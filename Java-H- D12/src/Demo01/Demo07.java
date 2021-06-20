package Demo01;

import java.util.function.Consumer;

public class Demo07 {
    public static void printStr(Consumer<String> consumer1,Consumer<String> consumer2){
        consumer1.andThen(consumer2).accept("hello world");
        //两个使用同一个string
    }

    public static void main(String[] args) {
        printStr((f)-> {
            for(char t:f.toCharArray()){
                if('a'<=t&&t<='z'){
                    t-=32;
                }
                System.out.println(t);

            }
        },(f)->{
            for(char t:f.toCharArray()){

            System.out.println(t);

        }
    });
}
}
