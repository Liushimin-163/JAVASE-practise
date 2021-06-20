public class MyData {
    int year;
    int month;
    int day;

    public MyData(int year,int month,int day) {
        this.year=year;
        this.month=month;
        this.day=day;

    }
    public void setDate(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;

    }
    public int getY(int year){
        return this.year;
    }
    public int getM(int month){
        return this.month;
    }
    public int getD(int day){
        return this.day;
    }
    public void showDate(){
        System.out.println("日期："+this.year+"年"+this.month+"月"+this.day+"日");
    }
    public void isBi(){
        if(this.year%4 == 0 && this.year%100 != 0 || this.year%400 == 0){
            System.out.println(this.year+"年是润年");
        }else{
            System.out.println(this.year+"年不是润年");
        }
    }
}
