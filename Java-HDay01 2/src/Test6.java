import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Test6 {
    public static void main(String[] args) throws ParseException {
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy年mm月dd日");
    SimpleDateFormat df=new SimpleDateFormat("yyyy-mm-dd");
    Date day=df.parse("2018-03-04");
    String f=sdf.format(day);
        System.out.println(f);
    }

}
