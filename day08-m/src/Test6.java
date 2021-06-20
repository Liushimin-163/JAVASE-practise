
import java.util.ArrayList;
public class Test6 {
    public static void main(String[] args) {
        ArrayList<String> list=getArrList();
        System.out.println("源字符串：");
        System.out.println(list);
        list=delStr(list);
        System.out.println("删除后：");
        System.out.println(list);
    }

    public static ArrayList<String> getArrList() {
        ArrayList<String> list=new ArrayList();
        list.add("bca");
        list.add("dadba");
        list.add("dddaaa");
        list.add("吃饭没？");
        list.add("我不饿啊，不吃了");
        list.add("有点困了");
        return list;
    }

    public static  ArrayList<String> delStr(ArrayList<String> list) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).length() >= 5){
                list.remove(list.get(i));
            }
        }
        return list;
    }
}
