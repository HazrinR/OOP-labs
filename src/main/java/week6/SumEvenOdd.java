package week6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Write a Java program to create a generic method that takes a list of
// numbers and returns the sum of all the even and odd numbers.
public class SumEvenOdd {

    public static <T extends Number> void CalcSumEvenOdd(List<T> numbers){
        int evenSum=0;
        int oddSum=0;
        for(T number : numbers){
            int num = number.intValue();
            if(num%2==0){
                evenSum+=num;
            }else {
                oddSum+=num;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
public static void main(String[] args){
    //example for integer numbers
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    CalcSumEvenOdd(numbers);
}
}

