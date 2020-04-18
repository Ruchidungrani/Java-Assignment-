/*Suppose you have a Saving Box with an initial amount of $50 and you have to add some more to it.
 Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50.
 Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Saving Box
2 - having a parameter which is the amount that will be added to Saving Box
Create object of the 'AddAmount' class and display the final amount in Saving Box. Also, create a method that can display how many transactions are done on the Saving Box.
*/
package Assignment;

class AddAmount{
    int amount=50;
    int transaction=0;
    private String displayTransaction;

    AddAmount(){

    }

    AddAmount(int value){
        this.amount+=value;
        this.transaction++;
    }
    public String displayTransaction(){
        System.out.println(this.transaction);
        return displayTransaction;
    }
}

public class Task6_5 {
    public static void main(String[] args) {
        AddAmount a1=new AddAmount();
        AddAmount a2=new AddAmount(25);
        AddAmount a3=new AddAmount(25);

        System.out.println("Final Amount: "+a1.amount);
        System.out.println("transaction: "+ a1.displayTransaction());
        System.out.println("Final Amount: "+a2.amount);
        System.out.println("transaction: "+a2.displayTransaction());
        System.out.println("Final Amount: "+a3.amount);
        System.out.println("transaction: "+a3.displayTransaction());

    }
}
