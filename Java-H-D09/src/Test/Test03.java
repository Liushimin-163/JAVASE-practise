package Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos1=new FileOutputStream("c.txt",true);
        fos1.write("HelloWorld".getBytes());
        String s="\r\ni love java";
        for(int i=0;i<5;i++){
            fos1.write(s.getBytes());
        }
        fos1.close();
    }
}
