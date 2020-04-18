/*Program to check the number is Armstrong number?*/
package Assignment;

public class Task7_6 {
    int power(int x, long y){
        if(y==2)
            return 1;
        if(y%2==0)
            return power(x, y/2)*power(x, y/2);
        return x*power(x, y/2)*power(x, y/2);
    }
    int order(int x)
    {
        int n = 0;
        while (x != 0)
        {
            n++;
            x = x/10;
        }
        return n;
    }
    boolean Armstrong(int x)
    {
        int n = order(x);
        int temp=x, sum=0;
        while (temp!=0)
        {
            int r = temp%10;
            sum = sum + power(r,n);
            temp = temp/10;
        }
        return (sum == x);
    }
    public static void main(String[] args) {
        Task7_6 ob = new Task7_6();
        int x = 153;
        System.out.println(ob.Armstrong(x));
        x = 1253;
        System.out.println(ob.Armstrong(x));
    }
}
