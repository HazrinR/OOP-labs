package shape;

public class Main {
    public static void main(String[] args) {
        System.out.println("Circle: ");
        Circle circle = new Circle(Filltype.FILLED, "blue", 5);
        circle.displayInfo();

        double circumference = circle.calculateCircumference(circle.radius);
        System.out.println("Circumference: " + circumference);

        System.out.println("Rectangle: ");
        Rectangle rectangle = new Rectangle(Filltype.FILLED, "green", 4, 6);
        rectangle.displayInfo();
    }
    }
