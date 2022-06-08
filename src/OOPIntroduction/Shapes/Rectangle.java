package OOPIntroduction.Shapes;

public class Rectangle extends Shape {


    double width;
    double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public Rectangle(String color, boolean filled, double length) {
        super(color, filled);
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        double area = length * width;
        return area;
    }

    @Override
    double getPerimeter() {
        double perimeter = (length * 2) + (width * 2);
        return perimeter;
    }
}
