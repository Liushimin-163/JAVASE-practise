package ObjectStreamDemo;

import java.io.*;

public class Demo02 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        FileInputStream fileInputStream=new FileInputStream("a6.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Employee employee=(Employee)objectInputStream.readObject();
        System.out.println(employee);
        objectInputStream.close();
    }
}
