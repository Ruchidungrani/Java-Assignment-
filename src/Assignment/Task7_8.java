/*Print all permutations of the String*/
package Assignment;

import java.util.Scanner;

public class Task7_8 {
    public static void main(String[] args) {
        String s1;
        System.out.println("Enter your string here: ");
        Scanner sc = new Scanner(System.in);
        s1= sc.nextLine();
        int n = s1.length();
        Task7_8 permutation = new Task7_8();
        permutation.CalPermute(s1, 0, n-1);
    }
    private void CalPermute(String str, int x, int y)//x is starting index and y is end index
    {
        if (x == y)
            System.out.println(str);
        else
        {
            for (int i = x; i <= y; i++)
            {
                str = swap(str,x,i);
                CalPermute(str, x+1, y);
                str = swap(str,x,i);
            }
        }
    }
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
