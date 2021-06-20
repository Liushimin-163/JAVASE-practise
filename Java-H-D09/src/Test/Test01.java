package Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("a.txt");
        fileOutputStream.write("c".getBytes());
        fileOutputStream.close();
    }
}
