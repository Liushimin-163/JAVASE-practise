package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test06 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("a.txt");
        InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream,"GBK");
        int data=0;
        while((data=inputStreamReader.read())!=-1){
            System.out.print((char)data);
        }
        inputStreamReader.close();
    }
}
