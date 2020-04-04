/*Write a program in Java to display the pattern like right angle triangle with a number.
Test Data
Input number of rows : 10
Expected Output :
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
*/
package Assignment;
import java.util.*;
public class Task3_9 {
    public static void main(String[] args) {
        int x;
        System.out.print("Input number of rows : ");
        Scanner n = new Scanner(System.in);
        x = n.nextInt();

        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }

    }
}
