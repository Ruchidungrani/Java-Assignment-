/*Write a Java program to move all 0's to the end of an array.
 Maintain the relative order of the other (non-zero) array elements.
 */
package Assignment;
import java.util.*;
import java.util.Arrays;

public class Task4_5 {
    static void moveZeroAtEnd(int arr[], int size)
    {
        int count = 0;

        for (int i = 0; i < size; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        while (count < size)
            arr[count++] = 0;
    }
    public static void main(String[] args) {

        int myArray ;
        System.out.println("Enter the size of array:");
        Scanner a= new Scanner(System.in);
        myArray = a.nextInt();

        int array[] = new int[myArray];
        System.out.print("Enter array here: "+ " ");
        for(int i=0; i<myArray; i++){
            array[i] = a.nextInt();
        }

        int x= array.length;
        moveZeroAtEnd(array, x );

        for(int i=0; i<x; i++)
        System.out.print (" "+array[i]+" ");
    }
}
