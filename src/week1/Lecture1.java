package week1;
import java.util.Scanner;
 public class Lecture1 {
  public static void main(String[] args)
    {
        Scanner reader= new Scanner(System.in);
        //CALCULATOR FOR MATH
        System.out.println("welcome to the calculator");
        while(true)
        {
            System.out.println("enter a command (sum, difference, quit");
            String command=reader.nextLine();
            if(command.equals("quit"))
            {
                break;
            }
            System.out.println("enter the numbers ");
            int first=Integer.parseInt(reader.nextLine());
            int second=Integer.parseInt(reader.nextLine());
            if(command.equals("sum"))
            {
                int sum=first+second;
                System.out.println("sum is "+ sum);
            }
            else if(command.equals("difference"))
            {
                int difference=first-second;
                System.out.println("difference is "+ difference);
            }else
            {
                System.out.println("unknown command");
            }

        }
        System.out.println("thanks, bye");

 /*

       System.out.println("First\nSecond\nThird");
        String text="include text";
        int wholeNumber=123;
        wholeNumber=42; //mozemo koristiti samo varijablu po imenu bez prethodnog deklarisanja ako je prije deklarisana (linija iznad), samo mora biti isti tip nismo sada ovdje umjesto inta mogli staviti string neki jer je prethodno ovo ime deklarisano kao int
        double decimalNumber=3.2134;
        boolean isTrue=true;
        System.out.println("variable's type is text " + text);
        System.out.println("variable's type is integer " + wholeNumber);
        System.out.println("variable's type is decimal number " +decimalNumber);
        System.out.println("variable's type is truth value " +isTrue);
        var newType="Hazrin";
        int first=2;
        int second=4;
        int sum=first+second;
        System.out.println(sum);
        int calcWithParens=(1+1)+3*(2+5);
        int calcWithoutParens=1+1+3*2+5;
        System.out.println(calcWithParens); //23
        System.out.println(calcWithoutParens); //13
        int result=3/2;
        System.out.println(result);
        int first=3;
        int second=2;
        double res= first / second ; //result is again 1 bc. first and second are integers
        System.out.println(res);
        int remainder=7%2;
        System.out.println(remainder);
        //dividend or divisor (or both9 is float, result is also float
        double dividendDivisorIsFloat=3.0/2;
        System.out.println(dividendDivisorIsFloat);
        int prvi=3;
        int drugi=2;
        double result1=(double)prvi/drugi;
        double result2=(double)(prvi/drugi);
        System.out.println(result1);
        System.out.println(result2);
        String name=reader.nextLine(); //reading string
        int age=Integer.parseInt(reader.nextLine()); //reading int

        String rijec="course";
        if (!(rijec.equals("marzipan"))) //we use equals to compare strings, strings cannot be dcompared by ==
        {
            System.out.println("not same");
        } else {
            System.out.println(" same");
        }*/


    }}
