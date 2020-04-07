/*Write a JAVA method to return a boolean true if the string doesn’t have repeating letters and consecutive or nonconsecutive
i.e. all the letters of the string be unique (isogram) else false.
a. Write a JAVA program that reverse the words of a sentence.
For eg, => “Be Happy and Stay Motivated” => “eB yppah dna yatS detavitoM”. */

package Assignment;
import java.util.*;

public class Task5_4 {
    static boolean isIsogram(String str){
        str=str.toLowerCase();
        int len=str.length();
        char[] array=str.toCharArray();
       Arrays.sort(array);
        for(int i=0;i<len-1;i++){
            if (array[i] == array[i + 1])
                //System.out.print(array[i]);
               return false;
        }
        return true;
    }

    public static void ReverseWordOfString(String s1){
        String[] words = s1.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(s1);
        System.out.println(reversedString);
    }

    public static void main(String[] args){
        System.out.println("Enter the String value:");
        Scanner input=new Scanner(System.in);
        String s1=input.nextLine();
        System.out.println(isIsogram(s1));

        ReverseWordOfString(s1);
       // System.out.println(ReverseWordOfString(s1));

    }
}

