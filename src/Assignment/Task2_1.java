/*
Write a program in JAVA to perform the following operation:
If a number is divisible by 3 it should print “Consultadd” as a string
If a number is divisible by 5 it should print “JAVA Training” as a string
If a number is divisible by both 3 and 5 it should print “Consultadd JAVA Training” as a string.

* */
package Assignment;
import java.util.*;
public class Task2_1 {
    public static void main(String[] args) {
        int a;

        Scanner num1 = new Scanner (System.in);
        System.out.println("Enter number:=");
        a = num1.nextInt();
         if (a%3==0 && a%5==0){
             System.out.println("Consultadd JAVA Training");
         }
         else if(a%3==0){
             System.out.println("Consultadd");
         }
         else if(a%5==0){
             System.out.println("JAVA Training");
         }
    }
}
