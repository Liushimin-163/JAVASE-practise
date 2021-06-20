package Test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test04 {
    public static void main(String[] args) {
        String[] array={"黄药师","冯蘅","郭靖","黄蓉","郭芙","郭襄","郭破虏"};
        Stream.of(array).filter(s->s.startsWith("郭"))
                .forEach(System.out::println);
    }
}
