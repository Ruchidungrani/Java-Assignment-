/*Write a Java program to find the second smallest element in an array.*/
package Assignment;
import java.util.*;
import java.util.Arrays;

public class Task4_3 {
    static void secondSmallest(int arr[], int size){
        int first,second;

        first=second=Integer.MAX_VALUE;

        for(int i=0;i<size;i++){
            if(arr[i]<first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]<second && arr[i]!=first){
                second=arr[i];
            }
        }
        if(second==Integer.MAX_VALUE){
            System.out.println("there is no any second smallest:");
        }
        else{
            System.out.println("Second smallest number is :" + second );
        }

    }
    public static void main(String[] args) {

        int myArray;
        System.out.println("Enter the total number of element in array: ");
        Scanner sc= new Scanner(System.in);
        myArray = sc.nextInt();

        int a[]= new int[myArray];
        System.out.println("Enter all element in array: ");
        for(int i=0; i<myArray; i++){
            a[i]=sc.nextInt();
        }
        int x=a.length;
        secondSmallest(a,x);
    }
}
