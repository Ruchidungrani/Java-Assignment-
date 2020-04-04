/*Write a Java program that accepts two floating­ point numbers
and checks whether they are the same up to two decimal places.
 */
package Assignment;
import java.util.*;
public class Task3_11 {
    public static void main(String[] args) {
        double n1,n2;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter first floating­point number: ");
        n1 = n.nextDouble();
        System.out.println("Enter second floating­point number: ");
        n2 = n.nextDouble();

        n1 = Math.round(n1 * 100);
        n1 = n1 / 100;

        n2 = Math.round(n2 * 100);
        n2 = n2 / 100;

        if(n1==n2){
            System.out.println(n1 + " and " +n2 +" is same up to two decimal point.");
        }
        else {
            System.out.println(n1 + " and " +n2 +" is not same up to two decimal point.");
        }
    }
}
