/*Write a Java program to find the two elements from a given array of positive and negative numbers
 such that their sum is closest to zero.*/

package Assignment;
import java.util.*;
import java.util.Arrays;

public class Task4_10 {
    static void sumOfSmallAndLargeNumber(int arr[],int size){
       int min= 0;
       int max = 1;
       int sum = arr[0] + arr[1];
       int result;

       for(int i =0 ; i <size-1 ; i++){
           for(int j=i+1 ; j<size ; j++){
               result=arr[i] + arr[j];

               if(Math.abs(sum)> Math.abs(result)){  //we want result closet by zero that's why
                   sum=result;
                   min = i;
                   max = j;
               }
           }
       }

       System.out.println("Minimum sum of two elements are: " + arr[min]+ " " + arr[max]);
       System.out.println("Result is: "+ (arr[min] + arr[max]));
    }
    public static void main(String[] args) {
        int myArray;
        System.out.println("Enter the size of array: ");
        Scanner sc= new Scanner(System.in);
        myArray = sc.nextInt();

        int array[]=new int[myArray];
        System.out.print("Enter the array elements here: ");
        for(int i=0; i<myArray;i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        int x = array.length;

        sumOfSmallAndLargeNumber(array, x);

    }
}
