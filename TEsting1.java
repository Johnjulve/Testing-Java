// Test java for class purposes
import java.util.Scanner; //A java utility package that responds to users input

public class TEsting1 {  //Public is a keyword that allows the class to be visible to all classes

    public static void main(String[] args) {

        // Creates a reader variable where it will provide the user input.
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        // Interger(int) variable allows to store to input a whole number
        int number = reader.nextInt();
        // In this command will show the text written within the parenthesis and the number you have input
        System.out.println("You entered: " + number);
    }
}