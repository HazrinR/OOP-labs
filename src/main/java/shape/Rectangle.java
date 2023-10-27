package shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Filltype filled,String color, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Width: " +width);
        System.out.println("Height: " +height);
        System.out.println("Area: " +getArea());
    }

}


