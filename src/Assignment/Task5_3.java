/* Write a JAVA method to remove all the spaces from the String and return the resultant.*/
package Assignment;
import java.util.*;
import java.util.Arrays;

public class Task5_3 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String value:");
            String str=sc.nextLine();
            str = str.replaceAll("\\s", "");
            System.out.println(str);
        }
}
