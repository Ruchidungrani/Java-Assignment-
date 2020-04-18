/*Non repeating character */

package Assignment;
import java.util.*;

public class Task7_2 {
    public static void main(String[] args) {
        String s1;
        System.out.println("Enter your string here: ");
        Scanner sc= new Scanner(System.in);
        s1= sc.nextLine();
        System.out.println("The given string is: " + s1);
        for (int i = 0; i < s1.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < s1.length(); j++) {
                if (i != j && s1.charAt(i) == s1.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("The first non repeated character in String is: " + s1.charAt(i));
                break;
            }
        }
    }
}
