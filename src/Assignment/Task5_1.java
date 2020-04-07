/*Write a JAVA program that takes given String of words and return the length of the shortest word.*/
package Assignment;
import java.util.*;
import java.util.Arrays;

public class Task5_1 {
    public static void main(String[] args) {
        String s1= "JAVA is general programming language that is class based.";
        String word1 = " ";
        String small = " ";

        int length = 0;

        String[] words = new String[100];
        s1 = s1 + " "; // for getting last word in string

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=' '){
                word1 = word1 + s1.charAt(i);
            }
            else {
                words[length] = word1;
                length++;
                word1 = " ";
            }
        }

        small = words[0];

        for(int j = 0; j < length; j++){

            if(small.length() > words[j].length())
                small = words[j];
        }
        System.out.println("Smallest word: " + small);

    }
}
