package Tom培訓;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Lianxi {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入日期：yyyy年mm月dd日");
        String birthdayDate=sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年mm月dd日");
        Date birDay=sdf.parse(birthdayDate);
        long birthDayT=birDay.getTime();
        long TodayT=new Date().getTime();
        long birthTime=TodayT-birthDayT;
        System.out.println(birthTime/1000/60/60/24/365);
    }
}
