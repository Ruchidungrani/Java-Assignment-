package Assignment;

public class Task1_1 {
    public static void main(String[] args) {
        int x = 10;
        int y= 2;

        x = x*y; //x become 20
        y= x/y; //y become 10
        x = x/y; //x become 2

        System.out.println("Value of x is:=" + x);
        System.out.println("Value of y is:=" + y);
    }
}
