public class Test2 {
    public static void main(String[] args) {
        String[] pokerArray={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] colorArray={"黑桃","红桃","梅花","方片"};
        getNum(colorArray,pokerArray);

    }

    public static void getNum(String[] colorArray,String[] pokerArray) {
        for(int i=0;i<colorArray.length;i++){

            for(int j=0;j<pokerArray.length;j++){
                System.out.print(colorArray[i]+pokerArray[j]+" ");//colorArrayprint应该在里面一层，如果在第一层for函数下面，
                //一行只会出现一次

            }
            System.out.println();//
        }


    }

}

