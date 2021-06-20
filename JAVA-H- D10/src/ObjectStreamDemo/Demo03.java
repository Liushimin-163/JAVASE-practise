package ObjectStreamDemo;

import java.io.IOException;
import java.io.PrintStream;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        PrintStream printStream=new PrintStream("PrintOut.txt");
        System.setOut(printStream);
        System.out.println("Study harder");
    }


}
