import java.util.Scanner;

public class Notebook  {

    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hello:");
        String fn = input.next();
        System.out.print("code");
        int a = input.nextInt();
        
        int result = a*128;

        System.out.println("Welcome to Dark Web");
        System.out.println ("Access Granted"+": "+ fn);
        System.out.println ("Entering to"+": "+"Network"+" "+ result);

    }
}