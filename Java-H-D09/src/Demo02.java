package tompeixun;

import java.io.*;


public class Demo02{
        public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("a1.txt");

            int data2=-1;
            while((data2=fileInputStream.read())!=-1){
                System.out.println((char)data2);//data是二字码？
            }
            fileInputStream.close();
        FileInputStream fileInputStream1=new FileInputStream("a2.txt");
        byte[] data3=new byte[2];
        int length=0;
        while((length=fileInputStream1.read(data3))!=-1){
            System.out.println(length);//length是字节数？
        }

        }
}

