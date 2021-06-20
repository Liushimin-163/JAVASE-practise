import java.util.ArrayList;



public class Test8 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        arr.add(9);
        arr.add(11);
        arr.add(17);

        System.out.println(listTest1(arr,9));
    }


    public static int listTest1(ArrayList arr, Integer s) {
        for(int i = 0; i<arr.size();i++){
            if(arr.get(i).equals(s)){
                return i;
            }
        }
       return -1;
    }
}
