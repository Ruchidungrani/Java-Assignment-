/*Write a program to remove the duplicates from a sorted array change them into 0 and add 0 in the end.
input: [2,2,3,3,4,4,4,11,11,11,11]
output:[2,3,4,11,0,0,0,0,0,0,0]
*/
package Assignment;
import java.util.Arrays;
import java.util.*;

public class Task4_6 {
    public static void main(String[] args) {
        int[] myArray = {2,2,3,3,4,4,4,11,11,11,11};
        System.out.println("array: " + Arrays.toString(myArray));

        Arrays.sort(myArray); //sorting array

        int j = 0;
//comparing array element to next element if it's not same store in list
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] != myArray[j]) {
                j++;
                myArray[j] = myArray[i];
            }
            else if(myArray[i] == myArray[j]){
                myArray[i] = 0;
                j++;
            }
        }

        int[] result = Arrays.copyOf(myArray, j + 1);
        System.out.println("Final Array after removing duplicates: " + Arrays.toString(result));

        int count = 0;

        for (int i = 0; i < j; i++)
            if (myArray[i] != 0)
                myArray[count++] = myArray[i];

        while (count < j)
            myArray[count++] = 0;

        for(int i=0; i<myArray.length; i++)
            System.out.print (" "+myArray[i]+" ");

    }
}
