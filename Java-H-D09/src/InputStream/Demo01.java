package tompeixun.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo01 {
    public static void main(String[] args) {
        //实际开发尽量哟过try catch
        //FileInputStream fileIn=new FileInputStream("a3.txt");
        try {
            FileInputStream fileIn2=new FileInputStream("a1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
