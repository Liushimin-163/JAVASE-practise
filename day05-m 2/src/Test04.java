public class Test04 {
    public static void main(String[] args) {
        char[] Str={'a','l','f','m','f','o','b','b','s','n'};
        getTimes(Str);
    }

    public static void getTimes(char[] Str) {

        int[] count=new int[26];
        for(int i=0; i< Str.length;i++){
         int c =Str[i];//把str里的每个字母符号转化成数字97～112；
         count[c-97]++;//c-97是什么意思？是count[0]++?原来数组里的数字可以直接自增数字啊。
        }
        for(int i=0,ch =97;i<count.length;i++,ch++){
            if(count[i]!=0){
                System.out.println((char)ch+"--"+count[i]);
            }
        }
    }
}
//Java里面不能直接打出数列吗？只能回到内存储存地？也不能用if char in Str来判断某个字母在某数组中是否出现吗？