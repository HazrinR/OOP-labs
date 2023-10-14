package week2;
import java.util.Scanner;
/*public class Lab2 {
    public static void main(String[] args)
    {
        Scanner reader= new Scanner(System.in);
        String password="carrot";
        while(true)
        {
            System.out.println("type the password: ");
            String passw= reader.nextLine();
            if(passw.equals(password))
            {
                System.out.println("Right");
                System.out.print("The secret is: jryy qbar");
                break;
            }else{
                System.out.println("Wrong");
            }
        }

    }

}
public class Lab2 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int sum=0;
        int read=3;
        for(int i=0; i<read;i++)  //moze i bez for petlje
        {
            System.out.println("type the number: ");

            sum+=Integer.parseInt(reader.nextLine());
        }
        System.out.println("sum: "+sum);
    }
}
public class Lab2 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int sum=0;
        while (true)
        {
            int read=Integer.parseInt(reader.nextLine());

            if(read==0)
            {
                break;
            }
            sum+=read;
            System.out.println("sum now " +sum);

        }
        System.out.println("sum in the end " +sum);
    }
    }
public class Lab2 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("enter first ");
        int num1=Integer.parseInt(reader.nextLine());
        System.out.println("enter last ");
        int num2=Integer.parseInt(reader.nextLine());
        if(num1<=num2)
        {
            int i=num1;
            while(i<=num2){
                System.out.println(i);
                i++;
                }
        }else{
            System.out.println();
        }

    }
    }


public class Lab2 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        System.out.print("enter the number of times to print the text ");
        int num=Integer.parseInt(reader.nextLine());

        for (int i=0; i<num; i++) {
            printText();
        }
    }
    public static void printText()
    {
        System.out.println("In the beginning there were the swamp, the hoe and Java");


    }
}public class Lab2 {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);

    }
    public static void printStars(int amount)
    {

        for(int i=0; i<amount; i++){ //for petlja ispis u redove
            System.out.print("*"); //print a star
        }
        System.out.println(); //line break
    }
}
public class Lab2 { //8. zadatak a)
    public static void main(String[] args) {
        drawStarsPiramid(10);
    }
    public static void drawStarsPiramid(int red)
    {
        for(int i=0; i<red; i++)
        {
           for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }System.out.println();

        }
    }
    }
public class Lab2 { //8.zadatak b)
    public static void main(String[] args) {
        drawStarsPiramid(10);
    }
    public static void drawStarsPiramid(int red)
    {
        for(int i=red; i>=1; i--)
        {

            for(int j=i; j>=1; j--)
            {
                System.out.print("* ");
            }System.out.println();
        }
    }
}
public class Lab2 {
    public static void main(String[] args) {

        drawStarsPiramid(10);
    }
    public static void drawStarsPiramid(int red)
    {
        int number;
        for(int i=0; i<=red; i++)
        {
            number=1; //reset to 1 when outer loop iterates
            for(int j=0; j<i; j++)
            {
                System.out.print(number+ " ");
                number++;
            }System.out.println();
        }
    }
}
public class Lab2 {
    public static void main(String[] args) {

        drawStarsPiramid(10);
    }
    public static void drawStarsPiramid(int red)
    {
        for(int i=1; i<=red; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i+ " "); //ako je u prvoj iteraciji/prvom redu ispisuje 1 itd.

            }System.out.println();
        }
    }
}*/
public class Lab2 {
    public static void main(String[] args) {
        Scanner reader=new Scanner((System.in));
        System.out.println("enter a number ");
        int n=Integer.parseInt((reader.nextLine()));
        int i=0;
        int sum=0;
        while(i<=n)
        {
            int result=(int)Math.pow(2, i);
            i++;
            sum+=result;
        }
        System.out.println("sum is "+sum);

        }
    }