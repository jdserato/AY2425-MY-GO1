package Jun11;

public class Square extends Rectangle{
    public Square(String color, double side) {
        super(color, side, side);
    }

    @Override
    public String toString() {
        return super.toString() + " that is a Square";
    }
}
