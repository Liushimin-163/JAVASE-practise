package Test;

import java.io.FileInputStream;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("a.txt");
        int data=-1;
        while((data=fileInputStream.read())!=-1){
            System.out.println((char)data);
        }
        fileInputStream.close();
    }
}
