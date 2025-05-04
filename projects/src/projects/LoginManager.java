package projects;

import java.util.Scanner;

public class LoginManager {
	
	
    public static boolean login(Scanner sc) {
        String username = "Ashish";
        String password = "Shazam@19";

        System.out.print("Enter username: ");
        String inputUser = sc.next();

        System.out.print("Enter password: ");
        String inputPass = sc.next();

        if (username.equals(inputUser) && password.equals(inputPass)) {
            System.out.println("Login successful!\n");
            return true;
        } else {
            System.out.println("Invalid credentials.");
            return false;
        }
    }
}
