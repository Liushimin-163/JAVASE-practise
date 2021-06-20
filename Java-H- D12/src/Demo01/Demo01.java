package Demo01;
//lambda presentation
public class Demo01 {
    public static void printMsg(MyInterface myInterface){
        myInterface.print();
    }

    public static void main(String[] args) {
        printMsg(()-> System.out.println("print lambda"));
    }
}
