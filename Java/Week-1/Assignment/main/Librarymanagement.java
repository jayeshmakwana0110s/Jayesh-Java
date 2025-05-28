package main;

import service.Libraryservice;

import java.util.Scanner;

public class Librarymanagement {
    static Libraryservice ls = new Libraryservice();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n****** Library Management Menu ******");
            System.out.println("1. Add New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); // clear newline
            } else {
                System.out.println("Invalid input! Please enter a number from 1 to 6.");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    // Use readNonEmptyLine to prevent empty inputs
                    String title = readNonEmptyLine(sc, "Enter title: ");
                    String author = readNonEmptyLine(sc, "Enter author: ");
                    String generation = readNonEmptyLine(sc, "Enter generation: ");
                    int copies = getPositiveInt(sc, "Enter number of copies: ");
                    ls.addBook(title, author, generation, copies);
                    break;

                case 2:
                    ls.viewBooks();
                    break;

                case 3:
                    String searchTerm = readNonEmptyLine(sc, "Enter search title/author/generation: ");
                    ls.searchBooks(searchTerm);
                    break;

                case 4:
                    String borrowTitle = readNonEmptyLine(sc, "Enter book title: ");
                    String borrowAuthor = readNonEmptyLine(sc, "Enter book author: ");
                    String borrowGeneration = readNonEmptyLine(sc, "Enter book generation: ");
                    int borrowCopies = getPositiveInt(sc, "Enter number of copies to borrow: ");
                    ls.borrowBook(borrowTitle, borrowAuthor, borrowCopies, borrowGeneration);
                    break;

                case 5:
                    String returnTitle = readNonEmptyLine(sc, "Enter book title: ");
                    String returnAuthor = readNonEmptyLine(sc, "Enter book author: ");
                    String returnGeneration = readNonEmptyLine(sc, "Enter book generation: ");
                    int returnCopies = getPositiveInt(sc, "Enter number of copies to return: ");
                    ls.returnBook(returnTitle, returnAuthor, returnCopies, returnGeneration);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }

    private static String readNonEmptyLine(Scanner sc, String prompt) {
        String line;
        while (true) {
            System.out.print(prompt);
            line = sc.nextLine().trim();
            if (!line.isEmpty()) {
                return line;
            }
            System.out.println("Input cannot be empty. Please try again.");
        }
    }

    private static int getPositiveInt(Scanner sc, String prompt) {
        int number;
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                sc.nextLine(); // consume newline
                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Please enter a number greater than zero.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.nextLine(); // consume invalid input
            }
        }
    }
}
