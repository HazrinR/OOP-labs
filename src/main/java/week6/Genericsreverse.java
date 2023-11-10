package week6;
import java.util.ArrayList;
import java.util.List;

public class Genericsreverse {

        public static <T> List<T> reverseList(List<T> originalList) { //List<T> je tip koji vraca ova metoda
            List<T> reversedList = new ArrayList<>(originalList);
            int left = 0;
            int right = reversedList.size() - 1;

            while (left < right) {
                // Swap elements at left and right indices
                T temp = reversedList.get(left);
                reversedList.set(left, reversedList.get(right));
                reversedList.set(right, temp);

                // Move indices towards the center
                left++;
                right--;
            }

            return reversedList;
        }

        public static void main(String[] args) {
            // Example usage with different types of lists
            List<Integer> intList = List.of(1, 2, 3, 4, 5);
            List<String> stringList = List.of("apple", "banana", "cherry", "date", "fig");

            // Reverse integer list
            List<Integer> reversedIntList = reverseList(intList);
            System.out.println("Reversed Integer List: " + reversedIntList);

            // Reverse string list
            List<String> reversedStringList = reverseList(stringList);
            System.out.println("Reversed String List: " + reversedStringList);
        }
    }


