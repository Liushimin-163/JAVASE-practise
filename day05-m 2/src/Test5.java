public class Test5 {
    public static void main(String[] args) {
        int[] arr={95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int Avg=getAvg(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Avg){
                count++;
            }
        }
        System.out.println("高于平均分："+Avg+"的个数有"+count+"个");
    }

    public static int getAvg(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
           sum=sum+arr[i];
        }

        return sum/arr.length;
    }

}

