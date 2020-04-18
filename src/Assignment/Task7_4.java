/*Program to find if String has all Unique Characters?*/

package Assignment;

import java.util.Scanner;

public class Task7_4 {
     boolean uniqueString(String str) {
            for (int i = 0; i < str.length(); i++)
                for (int j = i + 1; j < str.length(); j++)
                    if (str.charAt(i) == str.charAt(j))
                        return false;

            return true;
        }

        public static void main(String[] args) {
            Task7_4 obj = new Task7_4();
            String s1;
            System.out.println("Enter your String Here: ");
            Scanner sc = new Scanner(System.in);
            s1 = sc.nextLine();
            if(obj.uniqueString(s1))
                System.out.println("String "+ s1 + " has unique char...");
            else
                System.out.println("String "+ s1 + " has duplicate char...");
    }
}
