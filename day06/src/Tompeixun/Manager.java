package Tompeixun;

public class Manager {
    private String name;
    private String number;
    private double salary;
    private double bonus;
    public Manager(){

    }
    public Manager(String name,String number,double salary,double bonus){
        this.name=name;
        this.number=number;
        this.salary=salary;
        this.bonus=bonus;
    }
    public void setCoder(String name,String number,double salary){
        this.name=name;
        this.number=number;
        this.salary=salary;
        this.bonus=bonus;

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
    public double getBonus(double bonus){
        return this.bonus;
    }
    public void intro(){
        System.out.println("程序员姓名："+this.name);
        System.out.println("工号："+this.number);

    }
    public void showSalary(){
        System.out.println("基本工资为"+this.salary+"奖金为"+this.bonus);
    }
    public void work(){
        System.out.println("正在努力的做着管理工作，分配任务，检查员工提交上来的代码.....");
    }
}
