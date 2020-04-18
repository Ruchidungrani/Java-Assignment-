/*Write a program to print the names of students by creating a Student class.
If no name is passed while creating an object of Student class, then the name should be "Unknown",
 otherwise the name should be equal to the String value passed while creating object of Student class.
 (Hint: Overloading concept)
 */
package Assignment;

class Student{
    String name;
    public Student(String s){
        name = s;
    }
    public Student(){
        name = "Unknown";
    }
}

public class Task6_3 {
    public static void main(String[] args) {
        Student s = new Student("Ruchi");
        Student a = new Student();
        System.out.println(s.name);
        System.out.println(a.name);

    }
}
