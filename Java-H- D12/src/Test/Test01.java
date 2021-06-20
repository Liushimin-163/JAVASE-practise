package Test;

public class Test01 {
    static void showLongTime(CurrentTimePrinter timePrinter){
        timePrinter.printCurrentTime();
    }

    public static void main(String[] args) {
        showLongTime(()-> System.out.println(System.currentTimeMillis()));
    }
}
