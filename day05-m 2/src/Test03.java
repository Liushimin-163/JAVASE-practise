public class Test03 {
    public static void main(String[] args) {
        String[] poker=getPoke();
        int Num1=1;
        int Num2=5;
        int Num3=50;

        System.out.print(poker[Num1-1]+" ");
        System.out.print(poker[Num2-1]+" ");
        System.out.print(poker[Num3-1]+" ");
        System.out.println();
        System.out.println("上面那种直接用poker【Num1-1】找到答案好像也行");

        String[] nPoke=getRightCard(poker,Num1,Num2,Num3);
        for(int i=0;i< nPoke.length;i++){
            System.out.print(nPoke[i]+" ");
        }

    }

     private static String[] getPoke(){//为什么是private？
         String[] pokerArray={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
         String[] colorArray={"黑桃","红桃","梅花","方片"};
         String[] poke=new String[52];
         int index=0;
         for(int i=0;i<colorArray.length;i++){

             for(int j=0;j<pokerArray.length;j++){
                 poke[index]=colorArray[i]+pokerArray[i];
                 index++;//index++要放到最里面，以免多次循环，总共到54次就会停止
             }

         }

         return poke;
     }

    public static String[] getRightCard(String[] poker,int N1,int N2,int N3) {
        String[] nPoke=new String[3];
        nPoke[0]= poker[N1-1];
        nPoke[1]= poker[N2-1];
        nPoke[2]= poker[N3-1];

       return nPoke;

    }

        }


