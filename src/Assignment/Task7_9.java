/**
 * Find the maximum value in Array without using Collection?
 */

package Assignment;

public class Task7_9 {
    static int res;
    static int max;
    static int temp=0;
    static int a[];

    public static void main(String[] args) {
        res=Task7_9.maximum(new int []{173,29,391,41});
        System.out.println ("Largest value in the given array is  : "+  res );
    }
    static int maximum(int a[])
    {
        max=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=a[max])
                max=i;
        }
        return (a[max]);
    }
}
