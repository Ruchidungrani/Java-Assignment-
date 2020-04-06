/*Write a Java program to get the difference between the largest and smallest values in an array of integers.
The length of the array must be 1 and above.*/

package Assignment;
import java.util.Arrays;
import java.util.*;

public class Task4_7 {
    public static void main(String[] args) {
        int myArray;
        System.out.println("Enter a size of array:=");
        Scanner sc= new Scanner(System.in);
        myArray = sc.nextInt();

        int array[] = new int[myArray];
        System.out.println("Enter all element in array:  ");

        for(int i=0; i<myArray;i++ )
            array[i] = sc.nextInt();

        int smallest = array[0];
        int largest = array[0];

        for(int i=0; i<array.length; i++){
            if(array[i] > largest){
                largest = array[i];
            }
            else if(array[i] < smallest)
                smallest = array[i];
        }
        System.out.println("difference between the largest and smallest values in an array is:  " + (largest - smallest));
    }
}
