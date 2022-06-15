package OOPIntroduction.Shapes;

public class ShapeTests {
    public static void main(String[] args) {

        Circle circle1 = new Circle("Red", true, 12);
        Circle circle2 = new Circle("Blue", true, 10);

      Rectangle rectangle1 = new Rectangle("Purple", false, 2,10.5);
      Rectangle rectangle2 = new Rectangle("Green", true, 7,17.25);

      Square square1 = new Square("Yellow", true, 42);
      Square square2 = new Square("Yellow", true, 7.124);

        System.out.println("Circle 1:");
        System.out.printf("The area оf circle is %.2f" + "\n", circle1.getArea());
        System.out.printf("The perimeter of the circle is %.2f"+ "\n", circle1.getPerimeter());
        System.out.printf("The color of the shape is %s.", circle1.getColor());
        System.out.println();

        System.out.println("Circle 2:");
        System.out.printf("The area оf circle is %.2f" + "\n", circle2.getArea());
        System.out.printf("The perimeter of the circle is %.2f"+ "\n", circle2.getPerimeter());
        System.out.printf("The color of the shape is %s.", circle2.getColor());
        System.out.println();
        System.out.println();

        System.out.println("Rectangle 1:");
        System.out.printf("The area оf rectangle is %.2f" + "\n", rectangle1.getArea());
        System.out.printf("The perimeter of the rectangle is %.2f"+ "\n", rectangle1.getPerimeter());
        System.out.printf("The color of the shape is %s.", rectangle1.getColor());
        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.printf("The area оf rectangle is %.2f" + "\n", rectangle2.getArea());
        System.out.printf("The perimeter of the rectangle is %.2f"+ "\n", rectangle2.getPerimeter());
        System.out.printf("The color of the shape is %s.", rectangle2.getColor());
        System.out.println();
        System.out.println();

      System.out.println("Square 1:");
      System.out.printf("The area оf square is %.2f" + "\n", square1.getArea());
      System.out.printf("The perimeter of the square is %.2f"+ "\n", square1.getPerimeter());
      System.out.printf("The color of the shape is %s.", square1.getColor());
      System.out.println();

      System.out.println("Square 2:");
      System.out.printf("The area оf square is %.2f" + "\n", square2.getArea());
      System.out.printf("The perimeter of the square is %.2f"+ "\n", square2.getPerimeter());
      System.out.printf("The color of the shape is %s.", square2.getColor());
      System.out.println();
      System.out.println();





    }
}
