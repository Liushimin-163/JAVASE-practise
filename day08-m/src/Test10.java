
import java.util.ArrayList;
import java.util.Scanner;

public class Test10 {
   static ArrayList<User> users=new ArrayList<>();
   static{
        users.add(new User("Mary","93005-iit"));
        users.add(new User("Selina","pdieg-2"));
        users.add(new User("Hebe","ieo8830485"));
        users.add(new User("Ella","ieherohr00"));
        users.add(new User("Arrow","iiensetnsl88"));
        for(int i=0;i<users.size();i++){
            users.get(i).print();
        }
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name=sc.nextLine();
        System.out.println("请输入密码:");
        String code=sc.nextLine();
        User log=new User(name,code);
        String l=checkUser(users,log);
        System.out.println(l);

    }
    public static String checkUser(ArrayList<User> a,User user){
        String o="";
        String name=user.getName();
        String psw=user.getPsw();
        for(int i=0;i<a.size();i++){

            if(a.get(i).getName().equals(name)){
                if(a.get(i).getPsw().equals(psw)){
                    return "登陆结果：登陆成功";
                }else{
                    return "登陆结果：密码错误";
                }

            }else{
                 o="用户名不存在";
                 continue;
            }

        }



        return o;
    }


}
