import java.util.Calendar;
import java.util.Date;
public class Test7 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR,2018);
        c.set(Calendar.MONTH,1);
        c.set(Calendar.DATE,14);
        int year=Calendar.YEAR;
        int month=Calendar.MONTH+1;//為什麼不直接設置2月？
        int date=Calendar.DATE;
        char week=getWeek(c.get(Calendar.DAY_OF_WEEK));//这步是什么意思，Calendar.DAY_OF_WEEK是指有几个7？
        System.out.println(year+"年"+month+"月"+date+"日是星期"+week);
    }


    public static char getWeek(int a){
        char[] c={' ','日','一','二','三','四','五','六'};//為什麼加' '？
        return c[a];
    }
}

