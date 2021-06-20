package Tompeixun;

public class People {
    private String name;
    private int age;
    private String content;
    private String eat;
    private String study;
    public People(String name,int age,String content,String eat,String study){
        this.name=name;
        this.age=age;
        this.content=content;
        this.eat=eat;
        this.study=study;
    }
    public String getName(String name){
        return this.name;
    }
    public int age(int age){
        return this.age;
    }
    public String content(String content){
        return this.content;
    }
    public String eat(String eat){
        return this.eat;
    }
    public String study(String study){
        return this.study;
    }
    public void printString(){
        System.out.println("年龄为"+this.age+"的"+this.name+this.eat+".....");
        System.out.println("年龄为"+this.age+"的"+this.name+this.study+this.content+".....");
    }

}
