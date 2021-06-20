public class Test01 {
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 50, 60, 66, 70, 80, 90, 99};
        getLotteryNum(arr);
    }

    public static void getLotteryNum(int[] arr){
          //int[] arr1=arr1[100];为什么arr的变量名需要和main里的变量名相同，为何不能新增加个变量arr1 在getLotteryNum里面，
        // 然后在main中使用getLotteryNum(arr1);

           System.out.println("您的大乐透号码为：");
           for(int i=0;i< arr.length;i++){
               // i<= length 時會超過length 范围 arr【length】
            System.out.print(arr[i]+" ");
        }

    }
}
