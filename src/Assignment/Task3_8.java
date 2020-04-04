/*Write a Java program that takes a year from user and print whether that year is a leap year or not.
 */
package Assignment;
import java.util.*;
public class Task3_8 {
    public static void main(String[] args) {
        System.out.println("Enter a year: ");
        int year;
        Scanner y1= new Scanner(System.in);
        year = y1.nextInt();

        boolean x= (year%4) == 0;
        boolean y= (year%100) != 0;
        boolean z= ((year % 100 == 0) && (year % 400 == 0));

        if(x && (y||z)){
                System.out.println(year + " is leap year!!");
        }
        else{
            System.out.println(year + " is not a leap year!!");
        }
    }
}
