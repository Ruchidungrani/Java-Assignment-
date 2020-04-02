/*
* Write a JAVA program which takes character input from the user,
If the character is from r, a, n, d, o, m (consider both upper and lower cases), then print FOUND.
Print NOT FOUND for all the other alphabets.
* */
package Assignment;
import java.util.*;
public class Task2_8 {
    public static void main(String[] args) {
        char c;
        System.out.println("Enter character: ");
        Scanner ch= new Scanner(System.in);
        c = ch.next().charAt(0);

        if(c=='r'||c=='a'||c=='n'||c=='d'||c=='o'||c=='m'||c=='R'||c=='A'||c=='N'||c=='D'||c=='O'||c=='M'){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }



    }
}
