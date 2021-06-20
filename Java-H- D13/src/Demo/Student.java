package Demo;

public class Student extends Person{
    @Override
    public  void sayHi(){
        System.out.println("Say Hello!");
    }
    public void show(){
        introMyself(()-> System.out.println("Say, bon jour"));
        introMyself(this::sayHi);
        introMyself(super::sayHi);
        introMyself(Person::testStatic);
    }
    public void introMyself(SayHelloInterface sayHelloInterface){
        sayHelloInterface.sayHi();
    }
}
