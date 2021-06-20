
public class Test1 {
    public static void main(String[] args) {
 String s="23.23456789";
        System.out.println("原数字："+s);
        HandleAble s1=new HandleAble(){
            @Override
            public String handleString(String s) {
                return s.substring(0,s.indexOf("."));
            }//重写方法。
        };
        String str=s1.handleString(s);
        System.out.println("取整后："+str);
        HandleAble s2=new HandleAble() {
            @Override
            public String handleString(String s) {
                int i=s.indexOf(".")+1+4;
                char l=s.charAt(i);
                char l1=(char)(s.charAt(s.indexOf(".")+4)+1);

                if(l<=4){
                     return s.substring(0,i);
                }else{
                     return s.substring(0,i-1)+l1;
                }

            }

        };
        String str2=s2.handleString(s);
        System.out.println("保留小数点4位："+str2);
    }
}
interface HandleAble {
    public abstract String handleString(String s);
}


