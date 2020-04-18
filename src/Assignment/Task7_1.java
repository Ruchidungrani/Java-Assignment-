/*Reverse String */
package Assignment;
import java.util.*;

public class Task7_1 {
    public static void main(String[] args) {
        String s1 ;
        String reverse = " ";

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string here: =");
        s1=sc.nextLine();
         int length = s1.length();

         for(int i = length-1;i>=0 ; i--)
             reverse = reverse+ s1.charAt(i);

         System.out.println("Reverse string is: ="+ reverse);
    }
}
