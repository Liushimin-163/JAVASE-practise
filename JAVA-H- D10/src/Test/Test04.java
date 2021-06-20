package Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(new File("data.txt")));
        bufferedWriter.write("\r\nkekekweidis");
        bufferedWriter.write("\r\nkdwoeweir");
        bufferedWriter.write("\r\nkekweoerrer");

        bufferedWriter.close();
        ArrayList<String> list=new ArrayList<>();
        BufferedReader bufferedReader=new BufferedReader(new FileReader(new File("data.txt")));
        String line=null;
        while((line=bufferedReader.readLine())!=null){
            list.add(line);
        }
        bufferedReader.close();
        System.out.println("Please enter verified codes:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(list.contains(str)){
            System.out.println("verified successfully");
        }else{
            System.out.println("fail verified");
        }

    }
}
