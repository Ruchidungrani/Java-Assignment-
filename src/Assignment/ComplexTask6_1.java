/*Print the sum,
 difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation
 whose real and imaginary parts are entered by user.
 */
package Assignment;
import java.util.*;
import java.util.Arrays;
public class ComplexTask6_1 {
    int real, imaginary;

    ComplexTask6_1() { //Default Constructor
    }

    ComplexTask6_1(int tempReal, int tempImaginary) {
        real = tempReal;
        imaginary = tempImaginary;
    }

    //for addition
    ComplexTask6_1 addNumber(ComplexTask6_1 c1, ComplexTask6_1 c2) {
        ComplexTask6_1 temp = new ComplexTask6_1();
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }

    //for Subtraction
    ComplexTask6_1 RemoveNumber(ComplexTask6_1 c1, ComplexTask6_1 c2) {
        ComplexTask6_1 temp = new ComplexTask6_1();
        temp.real = c1.real - c2.real;
        temp.imaginary = c1.imaginary - c2.imaginary;
        return temp;
    }

    //for Multiplication

    ComplexTask6_1 MultiplicationNumber(ComplexTask6_1 c1, ComplexTask6_1 c2) {
        ComplexTask6_1 temp = new ComplexTask6_1();
        temp.real = c1.real * c2.real;
        temp.imaginary = c1.imaginary * c2.imaginary;
        return temp;
    }

    //for Division
    ComplexTask6_1 DavideNumber(ComplexTask6_1 c1, ComplexTask6_1 c2) {
        ComplexTask6_1 temp = new ComplexTask6_1();
        temp.real = c1.real / c2.real;
        temp.imaginary = c1.imaginary / c2.imaginary;
        return temp;
    }

    public static void main(String[] args) {
        ComplexTask6_1 C1 = new ComplexTask6_1(9, 10);
        ComplexTask6_1 C2 = new ComplexTask6_1(3, 5);

        System.out.println("Complex number 1 : "+ C1.real + " + imaginary "+ C1.imaginary);
        System.out.println("Complex number 2 : "+ C2.real + " + imaginary"+ C2.imaginary);

        ComplexTask6_1 C3 = new ComplexTask6_1();

        C3 = C3.addNumber(C1, C2);
        System.out.println("Addition of complex number : "+ C3.real + " + imaginary "+ C3.imaginary);

        C3 = C3.RemoveNumber(C1, C2);
        System.out.println("Subtraction of complex number : ("+ C3.real + ") - imaginary ("+ C3.imaginary+")");

        C3 = C3.MultiplicationNumber(C1, C2);
        System.out.println("Multiplication of complex number : ("+ C3.real + ") * imaginary ("+ C3.imaginary+")");

        C3 = C3.DavideNumber(C1, C2);
        System.out.println("Divison of complex number : ("+ C3.real + ") / imaginary ("+ C3.imaginary+")");


    }
}


