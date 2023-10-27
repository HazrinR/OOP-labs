package shape;

public class Circle extends Shape{
    protected double radius;

    public Circle(Filltype filled,String color,  double radius)
    {
        super(color, filled);
        this.radius=radius;
    }
    public double calculateCircumference(double PI, double radius)
    {
        return 2*PI*radius;
    }
    public double calculateCircumference(double radius)
    {
        double PI=Math.PI;
        return calculateCircumference(PI, radius);
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Radius: " +radius);
        System.out.println("Area: " +getArea());
    }

}
