/*
*Find all possible combinations of String? (using recursion)
* */
package Assignment;

public class Task7_10 {
    static void AllCombination(int arr[], int data[], int start,
                               int end, int index, int r)
    {
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            AllCombination(arr, data, i+1, end, index+1, r);
        }
    }
    static void printComb(int arr[], int n, int r)
    {
        int data[]=new int[r]; //temp array for store data
        AllCombination(arr, data, 0, n-1, 0, r);
    }
    public static void main(String[] args) {
        int arr[] = {5,6,8,7};
        int r = 3;
        int n = arr.length;
        printComb(arr, n, r);
    }

}
