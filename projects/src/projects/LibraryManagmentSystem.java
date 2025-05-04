package projects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryManagmentSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        
        
        // Login prompt before proceeding
        if (!LoginManager.login(sc)) {
            System.out.println("Exiting system.");
            return; 
        }
        
        
        int choice = -1;

        do {
            try {
                System.out.println("\n--- Library Menu ---");
                System.out.println("1. Add Book");
                System.out.println("2. Display Books");
                System.out.println("3. Issue Book");
                System.out.println("4. Return Book");
                System.out.println("5. Delete Book");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> library.addBook();
                    case 2 -> library.displayBooks();
                    case 3 -> library.issueBook();
                    case 4 -> library.returnBook();
                    case 5 -> library.deleteBook();
                    case 6 -> System.out.println("Exiting Library System. Goodbye!");
                    default -> System.out.println("Invalid choice. Please select between 1 to 6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // Clear buffer
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        } while (choice != 6);

        sc.close();
    }
}
