/*Write a Java program to sort an array of positive integers of a given array,
in the sorted array the value of the
first element should be maximum, second value should be minimum value,
 third should be second maximum, fourth second be second minimum and so on.
 */
package Assignment;
import java.util.*;
import java.util.Arrays;

public class Task4_11 {
    static void ArrangeLargeSmallElements(int arr[], int n){
        int temp[] = new int[n]; //Create temp array to store new array list

        int min= 0;
        int max = n-1;

        boolean flags = true;

        for(int i=0; i<n; i++){
            if(flags)
                temp[i] = arr[max--];
            else
                temp[i] = arr[min++];

            flags = !flags;
        }
        arr = temp.clone(); // copy all the array element to original array from temp array
    }
    public static void main(String[] args) {
        int myArray;
        System.out.print("Enter the size of array: ");
        Scanner sc= new Scanner(System.in);
        myArray = sc.nextInt();

        int array[] = new int[myArray];
        System.out.println("Enter all element in array here : ");
        for(int i = 0; i<myArray; i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

         int x= array.length;

        ArrangeLargeSmallElements(array, x);
        System.out.println("Rearrange array is : ");
        System.out.print(Arrays.toString(array));
    }
}
