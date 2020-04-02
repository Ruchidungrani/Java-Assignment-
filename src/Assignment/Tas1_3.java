package Assignment;
import java.util.*;
public class Tas1_3 {
    public static void main(String[] args) {
        int a;
        int b;
        int z;

        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter First number:= ");
        a = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter second number: =");
        b = num1.nextInt();

        z = a +b;
        System.out.println("Value of z before adding 30:=" + z);

        z= z+30;
        System.out.println("Value of z after adding 30:=" + z);
    }
}
