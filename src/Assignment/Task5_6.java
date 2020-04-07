/*Write a JAVA program that swaps the case of the alphabets of the string,
For eg,  => “heLLo WOrLd” => “HEllO woRlD”.

*/
package Assignment;
import java.util.*;

public class Task5_6 {
static void SwapAlphabets(StringBuffer str)
{
    int n = str.length();

    // Conversion using predefined methods
    for (int i=0; i<n; i++)
    {
        Character c = str.charAt(i);
        if (Character.isLowerCase(c))
            str.replace(i, i+1, Character.toUpperCase(c)+"");
        else
            str.replace(i, i+1, Character.toLowerCase(c)+"");

    }
}

    public static void main(String[] args)
    {
        String s1;
        System.out.println("Enter your string here: ");
        Scanner sc= new Scanner(System.in);
        s1 = sc.nextLine();
        StringBuffer str = new StringBuffer(s1);

        SwapAlphabets(str);

        System.out.println("Swap Alphabets lower to upper and upper to lower: "+ str);
    }
}
