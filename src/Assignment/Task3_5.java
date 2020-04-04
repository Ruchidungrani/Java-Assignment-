/*Write a JAVA program that takes long type input from user, and
Calculate and display the number of digits.
Calculate the sum of all the digits of the input.
*/
package Assignment;
import java.util.*;

public class Task3_5 {
    public static void main(String[] args) {
        long count=0;
        long n;
        long sum = 0;
        long x;
        System.out.println("Enter a value of long:= ");
        Scanner sc= new Scanner(System.in);
        n= sc.nextLong();
        while(n!=0){
            n=n/10;
            ++count;
        }
        System.out.println("Total number of digits:= "+ count);

        System.out.println("Enter a value of long for sum of digit:= ");
        long m = sc.nextLong();

        while(m>0){
            x= m%10;
            sum = x + sum;
            m=m/10;
        }
        System.out.println("sum of all digits:= "+ sum);

    }
}
