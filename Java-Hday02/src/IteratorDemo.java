import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> arr=new ArrayList<>();
        arr.add("great");
        arr.add("scrap");
        arr.add("jobs");
        arr.add("lesli");
        Iterator<String> it= arr.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
    }
}
