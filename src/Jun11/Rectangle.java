package Jun11;

public class Rectangle extends Shape{
    private double length, width;
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
    @Override
    public String toString() {
        return super.toString() + " that is a Rectangle";
    }
}
