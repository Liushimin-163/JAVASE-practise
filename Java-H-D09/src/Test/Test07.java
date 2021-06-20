package Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("info.txt",true);
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("输入信息: ");
            String str=sc.nextLine();

            if("886".equals(str)){
                break;
            }
            fileWriter.write("\r\n"+str);
        }
        fileWriter.flush();
    }
}
