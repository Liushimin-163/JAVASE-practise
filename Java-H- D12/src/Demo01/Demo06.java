package Demo01;

import java.util.function.Consumer;

//present Consumer<T>function interface
public class Demo06 {
    public static void printStr(Consumer<String> consumer){
        consumer.accept("hello world");
    }

    public static void main(String[] args) {
        printStr((f)-> {
            for(char t:f.toCharArray()){
                System.out.println(t);
            }
        });
    }
}
