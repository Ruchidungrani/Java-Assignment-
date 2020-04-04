/*Write a program that accepts three numbers from the user and prints "INCREASING" if the numbers are in increasing order,
 "DECREASING" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise. FOR eg.
Input first number: 1524
Input second number: 2345
Input third number: 3321
*/
package Assignment;
import java.util.*;

public class Task3_6 {
    public static void main(String[] args) {

        int x;
        int y;
        int z;
        System.out.println("Enter the first number:");
        Scanner x1 = new Scanner(System.in);
        x = x1.nextInt();
        System.out.println("Enter the second number: ");
        Scanner y1 = new Scanner(System.in);
        y = y1.nextInt();
        System.out.println("Enter the third number: ");
        Scanner z1 = new Scanner(System.in);
        z = z1.nextInt();

        if(x<y && y<z){
            System.out.println("Increasing order ");
        }
        else if(x>y && y>z){
            System.out.println("Decreasing order ");
        }
        else  {
            System.out.println("Neither increasing or decreasing order");
        }

    }



}
