/*
* Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
* Otherwise, print "positive" or "negative".
* Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
 * */
package Assignment;
import java.util.*;

public class Task2_7 {
    public static void main(String[] args) {
        Float a;
        System.out.println("Enter Floating point number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        System.out.println("Enter Floating point number:"+a);

        if(a==0){
            System.out.println("Zero");
        }
        else if(a>0){
            if(a<1){
                System.out.println("Small");
            }
            else if(a>1000000) {
                System.out.println("large");
            }
            System.out.println("Positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }



    }
}
