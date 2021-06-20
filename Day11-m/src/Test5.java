public class Test5 {
    public static void main(String[] args) {

        Player player = new Player();
        String select = "法力角色";
        System.out.println("选择:"+ select);
        FightAble f = player.select(select);//插口新建对象这里还是不是很明白，为什么插口能新建对象？
        f.specialFight();//select赋值后可以使用子类重写的程序。
        f.commonFight();

        System.out.println("=================");
        select = "武力角色";
        System.out.println("选择:"+ select);
        FightAble f2 = player.select(select);
        f2.specialFight();
        f2.commonFight();

    }
}

class Player {
    public FightAble select(String str) {

        if ("法力角色".equals(str)) {
            return new FaShi();
        } else if ("武力角色".equals(str)) {
            return new ZhanShi();
        }

        return null;
    }

}

class FaShi implements FightAble {
    @Override
    public void specialFight() {

        System.out.println("法术攻击");
    }
}

class ZhanShi implements FightAble {
    @Override
    public void specialFight() {
        System.out.println("武器攻击");
    }
}

interface FightAble {
    public abstract void specialFight();

    public default void commonFight() {
        System.out.println("普通打击");
    }
}