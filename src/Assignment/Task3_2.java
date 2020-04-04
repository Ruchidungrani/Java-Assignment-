/*Write a program in which:
Take 10 values input from user using loop.
Print sum of all the numbers provided
Print the Average of those 10 values
*/
package Assignment;
import java.util.*;
public class Task3_2 {
    public static void main(String[] args) {
        int x ;
        int Result=0;
        System.out.println("Enter number");
        for(int i=1;i<=10;i++) {
            Scanner input = new Scanner(System.in);
            x = input.nextInt();
            Result=Result+x;
        }
        System.out.println("Sum of all 10 values:=" + Result);
        int avg=Result/10;
        System.out.println("Average of all integer is:="+ avg);
    }
}
