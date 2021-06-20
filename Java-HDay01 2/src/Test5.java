import java.text.SimpleDateFormat;
import java.util.Date;
public class Test5 {
    public static void main(String[] args) {
        long today=new Date().getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        String now=sdf.format(today);
        System.out.println(now);
    }
}
