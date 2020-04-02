/*
 * Given an integer , perform the following conditional actions:
 * If  is odd, print NEW
 * If  is even and in the inclusive range of 2 to 5 , print OLD
 * If  is even and in the inclusive range of 6 to 30, print NEW
 * If  is even and greater than 30, print OLD
 */
package Assignment;
import java.util.*;

public class Task2_6 {
    public static void main(String[] args) {
        int n;
        Scanner num = new Scanner(System.in);
        n = num.nextInt();

        if(n%2==1){
            System.out.println("New");
        }
        else{
            if(n>=2 && n<=5){
                System.out.println("old");
            }
            else if(n>=6 && n<=30){
                System.out.println("New");
            }
            else if(n>=30){
                System.out.println("Old");
            }

        }
    }
}
