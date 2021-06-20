public class Demo01 {//public outer

    // static type//void noreturn
    //main name of function
    //return
    public static void main(String[] args) {
        gameA();
        short s=1;
        s+=1;
        System.out.println(s);
        byte b1=1;
        byte b2=2;
        byte b3=(byte)(b1+b2);
        byte b4=1+2;
        System.out.println(b3);
        System.out.println(b4);
        System.out.println("————————————");
        //gameB();
    }


    public static void gameA() {
        String answer = "美";
        System.out.println("镜子的答案： " + answer);
        String result = (answer == "美") ? "我很美" : "我不美";
        System.out.println("我美吗？" + result);

    }

    public static void gameB() {
        double score = 10.0;
        String result2 = (score >= 80) ? "颁发奖品" : "不发奖品";
        System.out.println(result2);
        int i = (1 == 2 ? 100 : 200);
        System.out.println(i);
        int j = (3 <= 4 ? 500 : 600);
        System.out.println(j);


    }
}
