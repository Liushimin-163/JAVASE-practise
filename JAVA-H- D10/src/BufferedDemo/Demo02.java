package BufferedDemo;

import java.io.*;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        Reader reader=new FileReader("a2.txt");
        BufferedReader bufferedReader=new BufferedReader(reader);
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();
    }
}
