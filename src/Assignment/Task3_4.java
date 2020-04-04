/*Write a JAVA program that takes one integer input n from the user,
and display all the so, print sum of n natural numbers.
 */

package Assignment;
import java.util.*;
public class Task3_4 {
    public static void main(String[] args) {
        int no;
        System.out.println("Enter the number...");
        Scanner number = new Scanner(System.in);
        no = number.nextInt();
        int sum=0;
        System.out.println("Enter the n time number...");
        for(int i=1; i<=no;i++){
            int x=number.nextInt();
            if(no>=0){
                sum+=x;
            }
        }
        System.out.println("Sum of the number is" + sum);
    }
}
