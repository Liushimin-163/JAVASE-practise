package tompeixun;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04 {
    public static void main(String[] args) throws IOException {

        FileInputStream data = new FileInputStream("test.jpg");
        FileOutputStream data2=new FileOutputStream("TestCopy.jpg");
        byte[] image=new byte[1024];
        int length=0;
        while((length=data.read(image))!=-1){
            data2.write(image,0,length);
        }
        data2.close();
        data.close();
    }
}
