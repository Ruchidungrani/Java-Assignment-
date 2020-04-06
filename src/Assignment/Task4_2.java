/*Write a Java program to find the second largest element in an array.*/
package Assignment;
import java.util.*;
public class Task4_2 {
        public static void secondLargest(int arr[],int size){
            int first,second;

            first=second=Integer.MIN_VALUE; //integer.MIN_VALUE stores the minimum possible value for any integer variable

            for(int i=0;i<size;i++){
                if(arr[i] > first){
                    second=first;
                    first = arr[i];
                }
                else if(arr[i]> second && arr[i]!=first){
                    second=arr[i];
                }
            }

            if(second==Integer.MIN_VALUE){
                System.out.println("No any Second largest number");
            }
            else
            {
                System.out.println("Second largest number is: "+ second);
            }
        }
    public static void main(String[] args) {
        //taking input from user
        int myArray;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of element in array:");
        myArray = sc.nextInt();

        int []a = new int[myArray];
        System.out.println("Enter all element in array ");
        for(int i=0;i<myArray;i++){
            a[i] = sc.nextInt();
        }

      //  int []myArray = {1,8,44,5,66,4,2,1,8,6,55,46}; this manually in case
        int x = a.length;
        secondLargest(a, x );
    }
}
