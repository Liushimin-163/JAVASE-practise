package Test;

import java.io.FileInputStream;
import java.io.IOException;

public class Test05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("d.txt");
        byte[] b=new byte[2];
        int length=0;
        while((length=fis.read(b))!=-1){//length是取到的长度
            System.out.println(new String(b,0,length));//值已经取进b数组里了
        }
        fis.close();
    }
}
