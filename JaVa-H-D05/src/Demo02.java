import java.util.ArrayList;
import java.util.Scanner;

public class Demo02 {
    //如果用户名字已经注册，抛出异常
    //如果没有，则添加成功
    //登陆如果用户名不存在，则提示该用户不存在contains
    static ArrayList<String> userNames = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Please register name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        checkUsername(name);
        System.out.println("Please input your username: ");
        String name1 = sc.next();
        try {
            login(name1);
        } catch (LoginException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkUsername(String name) {
        for (String n : userNames) {
            if (n.equals(name)) {
                throw new RegisterException("This user name is registered.");
            }
        }
        userNames.add(name);
    }

    public static void login(String name) throws LoginException {
        if (!userNames.contains(name)) {
            throw new LoginException("Sorry,this username is not existed.");
        } else {
            System.out.println("Congratulations!Login successfully!");
        }

    }
}


