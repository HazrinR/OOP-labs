package people;
import java.util.ArrayList;
import java.util.List;
public class Student extends Person{
    private int credits;

    public Student(String name, String address)
    {
        super(name, address);
        this.credits=0;

    }
    public int credits()
    {
        return this.credits;
    }
    public void study()
    {
        this.credits++; //samo racuna credits naspram study, ne vraca nista
    }
    @Override
    public String toString()
    {
        return super.toString() +"\n\tcredits" +this.credits;
    }


}
