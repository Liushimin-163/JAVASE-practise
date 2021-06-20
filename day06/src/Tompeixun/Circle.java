package Tompeixun;

public class Circle {
    int r;

    public Circle() {
    }

    ;

    public Circle(int r) {
        set(r);

    }

    public void set(int r) {
        this.r = r;
    }

    public int get() {
        return this.r;
    }

    public void showArea() {
        System.out.println("半径为：" + this.r + "，面积为：" + 3.14*this.r*this.r);
    }

    public void showPerimeter() {
        System.out.println("半径为：" + this.r + "，面积为：" + 3.14*2*this.r);
    }


}