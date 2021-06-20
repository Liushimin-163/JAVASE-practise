package Test;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test05 {
    public static void main(String[] args) throws IOException {
        String str="我爱Java";
        FileOutputStream fileOutputStream=new FileOutputStream("a.txt");
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream,"GBK");
        outputStreamWriter.write(str);
        outputStreamWriter.close();

    }
}
