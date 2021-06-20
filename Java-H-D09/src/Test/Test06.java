package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("test_copy.jpg");//显示找不到这个文件？
        FileOutputStream fos=new FileOutputStream("User\\test_copy.jpg");
        int len=-1;
        while((len=fis.read())!=-1){
           fos.write(len);
        }
        fos.close();
        fis.close();
    }
}
