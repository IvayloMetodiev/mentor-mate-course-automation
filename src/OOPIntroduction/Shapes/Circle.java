package OOPIntroduction.Shapes;

public class Circle extends Shape {

    double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
