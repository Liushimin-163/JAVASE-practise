public class Apple {
    double size;
    String color;

    public Apple(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){//@Override 这个toString 是继承了哪个插口吗？
        return size+"-"+color;
    }
}

