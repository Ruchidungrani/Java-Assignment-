/*Write a JAVA program that takes out the even from the odds and odd from the list of even numbers,
*  {23,25,75,87,47,1,91,51,2} //Output for this case =>2
=> {22,44,64,76,98,12,43,54,90} // Output for this case =>43.
*/

package Assignment;
import java.util.*;
import java.util.Arrays;

public class Task5_5 {
    public static void main(String[] args) {
        int myArray;
        System.out.println("Enter the size of array here: ");
        Scanner sc= new Scanner(System.in);
        myArray = sc.nextInt();

        int arr[] = new int[myArray];
        System.out.println("Enter array element here: ");
        for(int i=0; i<myArray; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {  //even number
                System.out.println("Even number : " + arr[i]);
            }
        }

        int arr1[] = new int[myArray];
        System.out.println("Enter array element here: ");
        for(int i=0; i<myArray; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i=0; i<arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                System.out.println("odd number : " + arr1[i]);
            }
        }

    }
}
