package Demo;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(){

    }
    public Person(String name){
    setName(name);
    }
    public  void sayHi(){
        System.out.println("Say HI");
    }
    public static void testStatic(){
        System.out.println("Just Test");
    }
}

