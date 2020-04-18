/**
 *Program to find all the sub-array whose sum is equal to the given number?
 */

package Assignment;

public class Task7_12 {
    int sumOfSubArray(int arr[], int n, int sum) {
        int sum1, i, j;
        for (i = 0; i < n; i++)
        {
            sum1 = arr[i];
            for (j = i + 1; j <= n; j++)
            {
                if (sum1 == sum)
                {
                    int x = j - 1;
                    System.out.println("Sum found between indexes " + i + " and " + x);
                    return 1;
                }
                if (sum1 > sum || j == n)
                    break;
                sum1 = sum1 + arr[j];
            }
        }
        System.out.println("No sub Array found");
        return 0;
    }

        public static void main(String[] args) {
            Task7_12 arraysum = new Task7_12();
            int arr[] = {1,5,10,15,23};
            int n = arr.length;
            int sum = 15;
            arraysum.sumOfSubArray(arr, n, sum);
        }
}
