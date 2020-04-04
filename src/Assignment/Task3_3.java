/*Write a JAVA program that takes user input from 1 to 12 for months, and display number of days of a particular month.
 (Shows “Invalid Details“ if incorrect month number will be provided).*/
package Assignment;
import java.util.*;
public class Task3_3 {
    public static void main(String[] args) {
        int month;
        System.out.println("Enter a number of month:");
        Scanner no= new Scanner(System.in);
        month = no.nextInt();

        if(month<=12) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("Total number of days is 31.");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("Total number of days is 30.");
            } else if (month == 2) {
                System.out.println("Total number of days is 28.");
            } else {
                System.out.println("Invalid Details....");
            }

        }
        else{
            System.out.println("Invalid Details...");
        }
    }
}
