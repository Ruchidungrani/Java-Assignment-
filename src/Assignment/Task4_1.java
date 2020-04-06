/*Write a Java program to remove duplicate elements from an array.*/
package Assignment;

import java.util.Arrays;
public class Task4_1 {
    public static void main(String[] args) {
        int[] myArray = {10, 15, 5, -1, 88, 5, 7, 99, 23, 23};
        System.out.println("array: " + Arrays.toString(myArray));

        Arrays.sort(myArray); //sorting array

        int j = 0;
//comparing array element to next element if it's not same store in list
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] != myArray[j]) {
                j++;
                myArray[j] = myArray[i];
            }
        }

        int[] result = Arrays.copyOf(myArray, j + 1);
        System.out.println("Final Array after removing duplicates: " + Arrays.toString(result));
    }
}
