/*Write a simple program to print multiplication table of a certain number taken from user,
For eg. 2 X 1 = 2
	2 X 2 = 4
	and so on.
*/
package Assignment;
import java.util.*;
public class Task3_1 {
    public static void main(String[] args) {
        int a;
        Scanner no =new Scanner(System.in);
        a=no.nextInt();
        for (int i=0; i<=10;i++){
            System.out.println("Multiplication table:= "+ a + "X" + i +"="+(a*i));
        }

    }
}

