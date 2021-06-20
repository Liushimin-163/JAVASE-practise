package BufferedDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo05 {
    public static void main(String[] args) throws IOException {
        String str="abc123HelloProgrammer";

        FileOutputStream outputStream=new FileOutputStream("a4.txt");
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(outputStream);
        outputStreamWriter.write(str);
        outputStreamWriter.close();
        FileOutputStream outputStream1=new FileOutputStream("a5.txt");
        OutputStreamWriter outputStreamWriter1 = new OutputStreamWriter(outputStream1, "GBK");

        outputStreamWriter1.write(str);
        outputStreamWriter1.close();
    }
}
