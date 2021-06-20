package tompeixun;

public class lianxi {
    public static void main(String[] args) {
  Laptop L=new Laptop();
  L.run();
  USB u=new Mouse();
  L.useUSB(u);
  Keyboard K=new Keyboard();
  L.useUSB(K);
  L.shutDown();
    }

}
interface USB{
    void open();
    void close();
}
class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("Mouse opened,red light flash.");
    }

    @Override
    public void close() {
        System.out.println("Mouse closed,red light turned off.");

    }
    public void click(){
        System.out.println("Click mouse.");
    }
}
class Keyboard implements USB{
    @Override
    public void open(){
        System.out.println("Keyboard opened,green light flash.");

        }

    @Override
    public void close() {
        System.out.println("Keyboard closed,green light turned off.");

    }
    public void type(){
        System.out.println("Type Keyboard");
    }
}
class Laptop{
   public void run(){
       System.out.println("Laptop operated");
   }
   public void useUSB(USB u){
       if(u!=null){
           u.open();//这步还没有转换成Mouse或Keyboard， 之前的执行也会是Mouse或者Keyboard文件的执行吗？

           if(u instanceof Mouse){
               Mouse m=(Mouse) u;//转换
               m.click();
           }else if(u instanceof Keyboard){
               Keyboard k=(Keyboard) u;
               k.type();
           }
           u.close();
       }
   }
   public void shutDown(){
       System.out.println("Laptop closed.");
   }
}
