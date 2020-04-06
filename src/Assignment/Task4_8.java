/*Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
 */
package Assignment;
import java.util.*;
import java.util.Arrays;

public class Task4_8 {

    public static int removeDuplicateElement(int[] array) {
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[index-1])
                array[index++] = array[i];
        }
        return index;
    }
    public static void main(String[] args) {
        int myArray[] = {5,88,9,55,88,5,77,7,6,44,2,22,1,44,55};
        System.out.println("Original array length: "+myArray.length);

        Arrays.sort(myArray);

        System.out.println("Array elements are: ");
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.print(myArray[i]+" ");
        }
        System.out.println(" ");
        System.out.println("The new length of the array is: "+removeDuplicateElement(myArray));
    }
}
