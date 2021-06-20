package Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("d.txt");

        fos.write("i love java".getBytes());
        fos.close();
    }
}
