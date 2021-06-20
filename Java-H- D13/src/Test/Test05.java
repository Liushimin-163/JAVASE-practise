package Test;

import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        array.add("陈玄风");
        array.add("梅超风");
        array.add("陆乘风");
        array.add("曲灵风");
        array.add("武眠风");
        array.add("冯默风");
        array.add("罗玉风");
        array.stream().limit(2).forEach(System.out::println);
        array.stream().skip(array.size()-2).forEach(System.out::println);

    }
}
