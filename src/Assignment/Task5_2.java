/*Write a JAVA program that gives sum of all the values of array except the highest and lowest values.*/

package Assignment;
import java.util.*;
import java.util.Arrays;

public class Task5_2 {
    public static class SumOfValues{
        static int sumOfValues(int[] arr,int size){
            int min = arr[0];
            int max = arr[0];
            int sum=0;

            for (int i = 1; i < size; i++) {
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i]);
            }

            for(int i=0;i<arr.length;i++){
                if(arr[i] == min || arr[i] == max){
                    sum+=0;
                }
                else{
                    sum+=arr[i];
                }
            }
            return sum;
        }

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the size of an array:");
            int len=sc.nextInt();

            int[] a=new int[len];
            System.out.println("Enter the values of an array:");
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Sum Of array values except maximum and minimum: "+sumOfValues(a,len));
        }
    }

    }
