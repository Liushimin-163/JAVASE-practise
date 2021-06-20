package tompeixun;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {

        FileOutputStream file=new FileOutputStream("a1.txt",true);
        File file1=new File("a2.txt");
        FileOutputStream fileStream=new FileOutputStream(file1);
        //file.write(97);
        //file.write(98);
        //file.write(99);
        //file.write("aaa".getBytes());
        file.write("ccc".getBytes());
        file.write("\n".getBytes());
        file.write("bbb".getBytes());
        fileStream.write("abcdefg".getBytes(),3,3);
        file.close();
        fileStream.close();
    }
}
