/*
* Write a program in JAVA to break and continue if the following cases occurs:
If user enters a negative number just break the loop and print “It’s Over”
If user enters a positive number just continue in the loop and print “Good Going”
* */
package Assignment;
import java.util.*;
public class Task2_4 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner num =new Scanner (System.in);

            do {
                int x = num.nextInt();
                if (x < 0) {
                    System.out.println("it's over");
                    break;
                } else {
                    System.out.println("Good going");
                }
            }while(true);
    }
}
