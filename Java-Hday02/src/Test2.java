import java.util.ArrayList;
import java.util.Collection;

public class Test2 {
    public static void main(String[] args) {
        Collection list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:"+listTest(list, "a"));
        System.out.println("b:"+listTest(list, "b"));
        System.out.println("c:"+listTest(list, "c"));
        System.out.println("xxx:"+listTest(list, "xxx"));
    }

    private static int listTest(Collection<String> list, String a) {
        int count =0;

        for(String string: list){
            if(a.equals(string)){
                count ++;
            }
        }

      return count;

    }



    }

