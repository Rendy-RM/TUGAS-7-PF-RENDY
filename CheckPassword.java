import static java.lang.System.*;
import java.util.Scanner;

public class CheckPassword {
    public static void main(String args[]) {
        System.out.print("What's the password?");
        Scanner keyboard = new Scanner(in);
        String password = keyboard.next();
        System.out.println("You typed >>" + password + "<<");
        System.out.println();
        if (password == "token") {
            System.out.println("The word you typed is stored");
            System.out.println("in the same place as the real");
            System.out.println("password. You must be a");
            System.out.println("hacker.");
        } else {
            System.out.println("The word you typed is not");
            System.out.println("stored in the same place as");
            System.out.println("the real password, but that's");
            System.out.println("no big deal.");
        }
        System.out.println();
        if (password.equals("token")) {
            System.out.println("The word you typed has the");
            System.out.println("same characters as the real");
            System.out.println("password. You can use our");
            System.out.println("precious system.");
        } else {
            System.out.println("The word you typed doesn't");
            System.out.println("have the same characters as");
            System.out.println("the real password. You can't");
            System.out.println("use our precious system.");
        }
        keyboard.close();
    }
}

