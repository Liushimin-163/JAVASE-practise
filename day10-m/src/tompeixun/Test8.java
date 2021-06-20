package tompeixun;

public class Test8 {
    public static void main(String[] args) {
    Star s= new Star();
    s.showA();
    System.out.println("===================");
    Planet g=new Sun();
    g.show();
    Sun a=(Sun) g; //不能直接引用子类功能，强制降级。
    a.showA();
    }
}
interface Planet{
    void show();


}
class Star {
   public void showA(){
       System.out.println("star:星星一闪一闪亮晶晶");
   }
}
class Sun extends Star implements Planet{
    @Override
    public void show() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }
    @Override
    public void showA(){
        System.out.println("sun:光照八分钟,到达地球");
    }




}