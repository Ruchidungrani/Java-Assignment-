/*Write a Java program to display Pascal's triangle.

Test Data
Input number of rows: 5
Expected Output :

Input number of rows: 5
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
*/
package Assignment;
import java.util.*;
public class Task3_10 {
    public static void main(String[] args) {

        int Row;
        int c=1;
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        Row = in.nextInt();
        for(int i=0;i<Row;i++)
        {
            for(int z=1;z<=Row-i;z++)
                System.out.print(" ");
            for(int j=0;j<=i;j++)
            {
                if (j==0||i==0)
                    c=1;
                else
                    c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
            System.out.print("\n");
        }
    }
}
