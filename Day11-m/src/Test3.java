import java.util.ArrayList;
public class Test3 {
    public static void main(String[] args) {
        ArrayList<User> ulist = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {//为什么User直接新建立的时候，i就直接赋值给Id了呢？这里也没有User a.setId(i)
            ulist.add(new User(i));
        }

        System.out.println("未分组:");
        System.out.println(ulist);

        Reception r1 = new Reception();
        Reception r2 = new Reception();
        Reception r3 = new Reception();
        r1.setF(new Filter() {
            @Override
            public void filterUser(User u) {//这一步已经设定了部分userType 不是null。
                if (u.getId() >= 10 && u.getId() < 20)
                    u.setType("v1");
            }
        });

        r2.setF(new Filter() {
            @Override
            public void filterUser(User u) {
                if (u.getId() >= 20 && u.getId() < 30)
                    u.setType("v2");
            }
        });

        for (int i = 0; i < ulist.size(); i++) {
            User user = ulist.get(i);
            r1.recept(user);
            r2.recept(user);
            r3.recept(user);
        }
        System.out.println("已分组:");
        for (int i = 0; i < ulist.size(); i++) {
            User user = ulist.get(i);
            if (i % 9 == 0) {
                System.out.println();
            }
            System.out.print(user + " ");
        }

    }


    }

interface Filter{
    public abstract void filterUser(User u);
}

