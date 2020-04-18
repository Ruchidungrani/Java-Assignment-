/*Program to find the intersection of two arrays in java?*/

package Assignment;

public class Task7_3 {
    public static void main(String[] args) {
        int myArray1[] = {1,2,3,4,5,6};
        int myArray2[] = {1,4,5,6,7,8};
        System.out.println("Intersection of the two arrays ::");

        for(int i = 0; i<myArray1.length; i++ ) {
            for(int j = 0; j<myArray2.length; j++) {
                if(myArray1[i]==myArray2[j]) {
                    System.out.println(myArray2[j]);
                }
            }
        }
    }
}
