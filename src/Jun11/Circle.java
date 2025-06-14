package Jun11;

public class Circle extends Shape{
    private final double diameter;
    public Circle(String color, double diameter) {
        super(color);
        this.diameter = diameter;
    }

    @Override
    public double getArea() {
        double radius = diameter / 2;
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        double radius = diameter / 2;
        return 2 * Math.PI * radius;
    }
}
