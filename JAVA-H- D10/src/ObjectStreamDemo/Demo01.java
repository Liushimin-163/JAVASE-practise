package ObjectStreamDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        Employee employee=new Employee("zhangsan",10000.0,"Programmer");
        System.out.println(employee);
        FileOutputStream fileOutputStream=new FileOutputStream("a6.txt",true);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
    }
}
