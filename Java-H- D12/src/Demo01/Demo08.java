package Demo01;

import java.util.function.Consumer;

public class Demo08 {
    //present consumer function andThen's method
    public static void printInfo(Consumer<String> consumer1,Consumer<String> consumer2){
       // String str="zhangsan,18";
        String[] array={"zhangsan,18","lily,20","coco,19"};
        for(String str:array){consumer1.andThen(consumer2).accept(str);}
    }

    public static void main(String[] args) {
        printInfo((data)->{
            System.out.print(data.split(",")[0]+":");
        },(data)->{
            System.out.println(data.split(",")[1]+"");
        });
    }
}
