/*Write a Java program to add two matrices of the same size.*/
package Assignment;
import java.util.*;
import java.util.Arrays;

public class Task4_4 {
    public static void main(String[] args) {
        int row, col;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of rows of matrix");
        row = sc.nextInt();
        System.out.println("Input number of columns of matrix");
        col  = sc.nextInt();

        int myArray1[][] = new int[row][col];
        int myArray2[][] = new int[row][col];
        int sum[][] = new int[row][col];

        System.out.println("Input elements of first matrix");

        for ( int i = 0 ; i < row ; i++ )
            for ( int j = 0 ; j < col ; j++ )
                myArray1[i][j] = sc.nextInt();

        System.out.println("Input the elements of second matrix");

        for (int  i = 0 ; i < row ; i++ )
            for ( int j = 0 ; j < col ; j++ )
                myArray2[i][j] = sc.nextInt();

        for ( int i = 0 ; i < row ; i++ )
            for ( int j = 0 ; j < col ; j++ )
                sum[i][j] = myArray1[i][j] + myArray2[i][j];

        System.out.println("Sum of the matrices:-");

        for ( int i = 0 ; i < row ; i++ )
        {
            for ( int j = 0 ; j < col ; j++ )
                System.out.print(sum[i][j]+"\t");

            System.out.println();
        }
    }
}
