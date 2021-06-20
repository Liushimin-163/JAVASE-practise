package Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test07 {
    public static void main(String[] args) {
        String[] arr1={"郭靖","杨康"};
        String[] arr2={"黄蓉","穆念慈"};
        Stream<String> stream1=Stream.of(arr1);
        Stream<String> stream2=Stream.of(arr2);
        List<String> list=Stream.concat(stream1,stream2).collect(Collectors.toList());
        System.out.println(list);
    }
}
