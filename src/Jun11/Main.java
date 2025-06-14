package Jun11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Rectangle("Orange", 5, 7.2);
        Shape s2 = new Square("Blue", 6.8);
        Circle s3 = new Circle("Orange", 9.3);
        Circle s4 = new Circle("Orange", 7);
        List<Shape> shapes = new ArrayList<>() ;
        shapes.add(s1);
        shapes.add(s2);
        shapes.add(s3);
        shapes.add(s4);
        for (Shape s : shapes) {
            System.out.println(s);
            System.out.printf("Area of the s: %.2f\n", s.getArea()); // late binding
            System.out.println("Perimeter of the s: " + String.format("%.2f", s.getPerimeter()));
        }
        System.out.println("AFTER:");
        shapes.sort(new ShapeComparator());
        for (Shape s : shapes) {
            System.out.println(s);
            System.out.printf("Area of the s: %.2f\n", s.getArea()); // late binding
            System.out.println("Perimeter of the s: " + String.format("%.2f", s.getPerimeter()));
        }
    }
}
