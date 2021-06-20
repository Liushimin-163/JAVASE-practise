package tompeixun;

import java.io.FileWriter;
import java.io.IOException;

public class Demo05  {
public static void main(String[]args) throws IOException{
        FileWriter fileWrite=new FileWriter("a4.txt",true);
        fileWrite.write(30000);
        fileWrite.write("c");
        fileWrite.write("\r\n".toCharArray());
        fileWrite.write("java程序员".toCharArray(),4,3);
        fileWrite.write("\r\n努力学习");
        fileWrite.flush();//或者close（）
}
}
