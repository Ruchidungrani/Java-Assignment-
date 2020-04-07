/*Write a JAVA program that gives boolean values; true, if the string has balanced braces and false,
if the string has unbalanced braces:
For eg,  => “({{)}[}]()” //output => true
//valid parenthesis
{{(  [ ) ] }}  => “[})(” //output => false.
*/
package Assignment;

public class Task5_7 {
    static class stack
    {
        int top=-1;
        char items[] = new char[100];
        void push(char x)  {
            if (top == 99)
                System.out.println("Stack full");
            else
                items[++top] = x;
        }

        char pop()  {
            if (top == -1)  {
                System.out.println("Underflow");
                return '\0';
            }
            else {
                char element = items[top];
                top--;
                return element;
            }
        }
        boolean isEmpty(){
            return (top == -1) ? true : false; }

    }

    static boolean MatchingPair(char ch1, char ch2)
    {
        if (ch1 == '(' && ch2 == ')')
            return true;
        else if (ch1 == '{' && ch2 == '}')
            return true;
        else if (ch1 == '[' && ch2 == ']')
            return true;
        else
            return false;
    }
    static boolean isBalanced(char c[])
    {
        stack st=new stack();
        for(int i=0;i<c.length;i++) {
            if (c[i] == '{' || c[i] == '(' || c[i] == '[') {
                st.push(c[i]);
            }
            if (c[i] == '}' || c[i] == ')' || c[i] == ']')
            {
                if (st.isEmpty()) {
                    return false; }
                else if ( !MatchingPair(st.pop(), c[i]) ) {
                    return false;  }
            }
        }
        if (st.isEmpty()) {
            return true; }
        else{
            return false;}
    }

    public static void main(String[] args){
        char[] c = {'{','(',')','}','[',']'};
        if (isBalanced(c)){
            System.out.println("Balanced.");
        }
        else{
            System.out.println("Not Balanced.");
        }
    }

}
