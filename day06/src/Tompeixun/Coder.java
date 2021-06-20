package Tompeixun;

public class Coder {
    private String name;
    private String number;
    private double salary;
    public Coder(){

    }
    public Coder(String name,String number,double salary){
        this.name=name;
        this.number=number;
        this.salary=salary;
    }
    public void setCoder(String name,String number,double salary){
        this.name=name;
        this.number=number;
        this.salary=salary;

    }
    public String getName(String name){
        return this.name;
    }
    public String getNumber(String number){
        return this.number;
    }
    public double getSalary(double salary){
        return this.salary;
    }
    public void intro(){
        System.out.println("程序员姓名："+this.name);
        System.out.println("工号："+this.number);

    }
    public void showSalary(){
        System.out.println("基本工资为"+this.salary+"，奖金无");
    }
    public void work(){
        System.out.println("正在努力谢代码.....");
    }
}
