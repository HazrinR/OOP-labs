package week6;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class lab6 {/*
    public static int Smallest(int[] numbers){
        int minValue=numbers[0];
        for(int i=1; i<numbers.length; i++)
        {
            if(numbers[i]<minValue)
            {
                minValue=numbers[i];
            }
        }return  minValue;
    }
    public static void main(String[] args)
    {
        int[] myArray={6,5,8,7,11};
        int smallestValue=Smallest(myArray);
        System.out.println("The smallest value in the array is: " + smallestValue);
    }
}
    public static int indexOfTheSmallest(int[] numbers){
        int minValue=numbers[0];
        int minIndex=0;
        for(int i=1; i<numbers.length; i++){
            if(numbers[i]<minValue){
                minValue=numbers[i];
                minIndex=i;
            }
        }
    return minIndex;}
    public static void main(String[] args)
    {
        int[] myArray={6,5,8,7,11};
        int minIndex=indexOfTheSmallest(myArray);
        System.out.println("Index of the smallest: " + minIndex);
    }

}
    public static int indexOfTheSmallestStartingFrom(int[] numbers, int index){
        int minValue=numbers[index];
        int minIndex=index;
        for(int i=index+1; i<numbers.length; i++){
            if(numbers[i]<minValue){
                minValue=numbers[i];
                minIndex=i;
            }
        }
        return minIndex;}
    public static void main(String[] args)
    {
        int[] myArray={6,5,8,7,11};
        System.out.println(indexOfTheSmallestStartingFrom(myArray,2));
    }
}
    public static void swap(int[] numbers, int index1, int index2){
        int temp=numbers[index1];
        numbers[index1]=numbers[index2];
        numbers[index2]=temp;
}
    public static void main(String[] args)
    {
        int[] myArray={3,2,5,4,8};
        System.out.println(Arrays.toString(myArray));
        swap(myArray,1,0);
        System.out.println(Arrays.toString(myArray));
        swap(myArray,0,3);
        System.out.println(Arrays.toString(myArray));
    }
}
public static int binarySearch(int[] numbers, int numberToFind){
    int left=0;
    int right=numbers.length-1;
    while(left<=right){
        int middlePosition=(left+right)/2;
        int middleNumber=numbers[middlePosition];
        if(numberToFind==middleNumber){
            return middlePosition;
        }
        if(numberToFind<middleNumber){
            right=middlePosition-1;
        }else {
            left=middlePosition+1;
        }
    }return -1;
}

    public static void main(String[] args) {
        int[] ints = {1, 2, 4, 5, 7, 9, 11};

        System.out.println("0 is at position: " + binarySearch(ints, 0));
        System.out.println("1 is at position: " + binarySearch(ints, 1));
        System.out.println("2 is at position: " + binarySearch(ints, 2));
        System.out.println("3 is at position: " + binarySearch(ints, 3));
        System.out.println("4 is at position: " + binarySearch(ints, 4));
        System.out.println("5 is at position: " + binarySearch(ints, 5));
        System.out.println("6 is at position: " + binarySearch(ints, 6));
        System.out.println("7 is at position: " + binarySearch(ints, 7));
        System.out.println("8 is at position: " + binarySearch(ints, 8));
        System.out.println("9 is at position: " + binarySearch(ints, 9));
        System.out.println("10 is at position: " + binarySearch(ints, 10));

    }}

    public static void printElegantly(int[] array) {
        if (array.length > 0) {     //// Print the first element without a leading comma.
            System.out.print(array[0]);

            for (int i = 1; i < array.length; i++) {
                System.out.print(", " + array[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        printElegantly(array);
    }
}
    public static void main(String[] args){
        HashMap<String, String> nicknameMap=new HashMap<>();
        nicknameMap.put("matti", "mage"); //umjesto add kao u arrays
        nicknameMap.put("mikael", "mixu");
        nicknameMap.put("arto", "arppa");
        String mikaelNickname=nicknameMap.get("mikael"); //get value
        System.out.println("mikaels nickname is "+ mikaelNickname);

    }
}*/
}
