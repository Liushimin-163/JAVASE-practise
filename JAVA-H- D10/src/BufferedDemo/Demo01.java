package BufferedDemo;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream=new FileInputStream("a1.txt");
        OutputStream outputStream=new FileOutputStream("a2.txt");
        BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(outputStream);
        try(bufferedInputStream;bufferedOutputStream){}catch(IOException e){e.printStackTrace();}
    }
}
