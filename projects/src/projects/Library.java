package projects;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {
	
	ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    final String filePath = "library_data.txt";

    public Library() {
        loadBooksFromFile();
    }

    public void addBook() {
        try {
            System.out.print("Enter book ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter book title: ");
            String title = sc.nextLine();

            System.out.print("Enter author name: ");
            String author = sc.nextLine();

            Book newBook = new Book(id, title, author);
            books.add(newBook);
            System.out.println("Book added successfully!");

            saveBookToFile(newBook);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter proper values.");
            sc.nextLine(); // clear the buffer
        } catch (Exception e) {
            System.out.println("An error occurred while adding the book: " + e.getMessage());
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            for (Book book : books) {
                book.displayInfo();
            }
        }
    }

    public void issueBook() {
        try {
            System.out.print("Enter book ID to issue: ");
            int id = sc.nextInt();

            for (Book book : books) {
                if (book.id == id) {
                    if (!book.isIssued) {
                        book.isIssued = true;
                        System.out.println("Book issued successfully.");
                        updateFile();
                        return;
                    } else {
                        System.out.println("Book is already issued.");
                        return;
                    }
                }
            }
            System.out.println("Book not found.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid book ID.");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("An error occurred while issuing the book: " + e.getMessage());
        }
    }

    public void returnBook() {
        try {
            System.out.print("Enter book ID to return: ");
            int id = sc.nextInt();

            for (Book book : books) {
                if (book.id == id) {
                    if (book.isIssued) {
                        book.isIssued = false;
                        System.out.println("Book returned successfully.");
                        updateFile();
                        return;
                    } else {
                        System.out.println("This book was not issued.");
                        return;
                    }
                }
            }
            System.out.println("Book not found.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid book ID.");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("An error occurred while returning the book: " + e.getMessage());
        }
    }

    public void deleteBook() {
        try {
            System.out.print("Enter book ID to delete: ");
            int id = sc.nextInt();

            for (Book book : books) {
                if (book.id == id) {
                    books.remove(book);
                    System.out.println("Book deleted successfully.");
                    updateFile();
                    return;
                }
            }
            System.out.println("Book not found.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid book ID.");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("An error occurred while deleting the book: " + e.getMessage());
        }
    }

    
    //File handling methods
    
    public void saveBookToFile(Book book) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(book.id + "," + book.title + "," + book.author + "," + book.isIssued);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Failed to save book to file: " + e.getMessage());
        }
    }

    public void loadBooksFromFile() {
        File file = new File(filePath);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 4);
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);
                    String title = parts[1];
                    String author = parts[2];
                    boolean isIssued = Boolean.parseBoolean(parts[3]);
                    books.add(new Book(id, title, author, isIssued));
                }
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading books from file: " + e.getMessage());
        }
    }

    public void updateFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Book book : books) {
                writer.write(book.id + "," + book.title + "," + book.author + "," + book.isIssued);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error updating file: " + e.getMessage());
        }
    }
}
