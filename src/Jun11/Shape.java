package Jun11;

import Jun04.Dog;

import java.util.Comparator;

public abstract class Shape {
    String color;
    public Shape(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString() {
        return "A shape that is color "+ color;
    }
}

class ShapeComparator implements Comparator<Shape> {
    public int compare(Shape o1, Shape o2) {
        int res = o1.color.compareTo(o2.color);
        if (res == 0) {
            return Double.compare(o1.getArea(), o2.getArea());
        }
        return res;
    }
}
