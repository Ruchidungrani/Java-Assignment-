/*Program to Count occurrences of each character in a string in java?*/
package Assignment;

import java.util.Scanner;

public class Task7_7 {
    static final int MAX_CHAR = 256;

    static void OccurrenceOfChar(String str)
    {
        int count[] = new int[MAX_CHAR];
        int len = str.length();

        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.println("Number of Occurrence in string  " +
                        str.charAt(i) + " is:" + count[str.charAt(i)]);
        }
    }
    public static void main(String[] args) {
        String s1;
        System.out.println("Enter you string here: ");
        Scanner sc = new Scanner(System.in);
        s1=sc.nextLine();
        OccurrenceOfChar(s1);
    }
}

