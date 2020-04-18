/*Program to Count the number of words in the String?*/

package Assignment;

import java.io.IOException;
import java.util.Scanner;

public class Task7_5 {
      public static void main(String[] args) {
          String s1;
          System.out.println("Enter your String Here: ");
          Scanner sc = new Scanner(System.in);
          s1 = sc.nextLine();

          int word = 0;
          for(int i=0; i<s1.length()-1; i++){
              if(s1.charAt(i)== ' ' && Character.isLetter(s1.charAt(i+1))&&(i>0)){
                  word++;
              }
          }
          word++;
          System.out.println("Total number of words in the string is : " + word);
      }
}
