package BufferedDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        Writer Writer=new FileWriter("a3.txt",true);
        BufferedWriter bufferedWriter=new BufferedWriter(Writer);
        bufferedWriter.write("Hello");
        bufferedWriter.newLine();
        bufferedWriter.write("Java");
        bufferedWriter.newLine();
        bufferedWriter.write("programmer");
        bufferedWriter.close();
    }
}
