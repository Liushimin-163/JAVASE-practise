package Test;

import java.io.*;

public class Test03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("C:\\c.png");
        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
        FileOutputStream fileOutputStream=new FileOutputStream("D:\\c-copy.png");
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
        byte[] data=new byte[1024];
        int length=-1;
        while((length=bufferedInputStream.read(data))!=-1){
            bufferedOutputStream.write(data,0,length);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}
