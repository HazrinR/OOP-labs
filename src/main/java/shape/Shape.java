package shape;

public class Shape {
    private String color;
    private Filltype filled;
    public Shape(String color, Filltype filled)
    {
        this.color=color;
        this.filled=filled;
    }
    public void displayInfo()
    {
        System.out.println("Color: " +color);
        System.out.println("Fill type: " +filled);
    }
    public double getArea()
    {
        return 0;
    }

}
