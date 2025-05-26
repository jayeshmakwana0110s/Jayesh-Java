package main;

import service.Library_Service;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Library_Management {
    static Library_Service ls= new Library_Service();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("******Library Management Menu Card******");
            System.out.println("1. Add New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.println("Choose the option from the menu card : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
            {
                case 1 :
                {
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter genre: ");
                    String generation = sc.nextLine();
                    System.out.print("Enter number of copies: ");
                    int copies = sc.nextInt();
                    sc.nextLine();
                    ls.addBook(title,author,generation,copies);
                    break;
                }
                case 2:
                {
                    ls.viewBooks();
                    break;
                }
                case 3 :
                {
                    System.out.print("Enter search query (Title/Author/Genre): ");
                    String book = sc.nextLine();
                    ls.searchBooks(book.toLowerCase());
                    break;
                }
                case 4:
                {
                    System.out.print("Enter book title to borrow: ");
                    String title = sc.nextLine();
                    ls.borrowBook(title);
                    break;
                }
                case 5:
                {
                    System.out.print("Enter book title to return: ");
                    String title = sc.nextLine();
                    ls.returnBook(title);
                    break;
                }
                case 6:
                {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default:
                    System.out.println("You enter the invalid choice");
                    break;
            }
        }
    }
}
