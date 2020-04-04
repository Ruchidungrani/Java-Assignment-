/*Write a Java program to find the number of days in a month.
Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days
*/
package Assignment;
import java.util.*;
public class Task3_7 {
    public static void main(String[] args) {
        int month;
        int year;

        System.out.println("Enter a month number: ");
        Scanner m1= new Scanner(System.in);
        month= m1.nextInt();

        System.out.println("Enter Year: ");
        Scanner y1= new Scanner(System.in);
        year= m1.nextInt();

        if(month >0 &&month<=12 ){
            if(month==1){
                System.out.println("January "+year+" has"+" 31 days.");
            }
            else if(month==2){
                System.out.println("February "+year+" has"+" 29 days.");
            }
            else if(month==3){
                System.out.println("March "+year+" has"+" 31 days.");
            }
            else if(month==4){
                System.out.println("April "+year+" has"+" 30 days.");
            }
            else if(month==5){
                System.out.println("May "+year+" has"+" 31 days.");
            }
            else if(month==6){
                System.out.println("June "+year+" has"+" 30 days.");
            }
            else if(month==7){
                System.out.println("July "+year+" has"+" 31 days.");
            }
            else if(month==8){
                System.out.println("August "+year+" has"+" 31 days.");
            }else if(month==9){
                System.out.println("September "+year+" has"+" 30 days.");
            }
            else if(month==10){
                System.out.println("October "+year+" has"+" 31 days.");
            }
            else if(month==11){
                System.out.println("November "+year+" has"+" 30 days.");
            }
            else if(month==12){
                System.out.println("December "+year+" has"+" 31 days.");
            }
            else{
                System.out.println("Invalid Input...");
            }


        }

    }
}
