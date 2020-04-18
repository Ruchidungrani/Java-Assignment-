/*Create a class named 'Rectangle' with two data members- length and breadth and a method to calculate the area which is
'length*breadth'. The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
*/
package Assignment;
import java.util.*;
class Rectangle{
    private int length;
    private int width;

    Rectangle(){
        this.length=0;
        this.width=0;
    }
    Rectangle(int value){
        this.length=value;
        this.width=value;
    }
    Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }

    int area(){
        return length*width;
    }
}

public class Task6_4 {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        Rectangle r2= new Rectangle(4);
        Rectangle r3= new Rectangle(3,4);
        System.out.println("Area of r1: "+ r1.area());
        System.out.println("Area of r1: "+ r2.area());
        System.out.println("Area of r1: "+ r3.area());
    }
}
