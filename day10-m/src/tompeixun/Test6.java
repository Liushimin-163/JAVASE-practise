package tompeixun;


public class Test6 {
    public static void main(String[] args) {
    Aa b=new Bb();
    b.showA();
    b.showB();
    b.showC();
    }
}
interface Aa{
    void showA();

    public default void showB() {
        show10("BBBB");
    }
    public default void showC(){
        show10("CCCC");
    }
    private void show10(String s){
        for(int i=0;i<10;i++){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
class Bb implements Aa{
    @Override
    public void showA() {
        System.out.println("AAAA");
    }


}
