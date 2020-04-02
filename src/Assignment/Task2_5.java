/**
 * Write a program that prints all the numbers from 0 to 6 except 3 and 6.
 *        Expected output: 0 1 2 4 5
 */
package Assignment;

public class Task2_5 {
    public static void main(String[] args) {
       for(int i=0;i<6;i++) {
           if(i!=3 && i!=6) {
               System.out.println("Expected Output:"+ i);
           }
       }
    }
}
