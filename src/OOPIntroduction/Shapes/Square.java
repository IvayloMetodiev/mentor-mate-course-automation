package OOPIntroduction.Shapes;

public class Square extends Rectangle {

    double side;

    public Square(String color, boolean filled, double length) {
        super(color, filled, length);
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        double area = length * length;
        return area;
    }

    @Override
    double getPerimeter() {
        double perimeter = 4 * length;
        return perimeter;
    }
}
