package service;

import model.Book;
import java.util.*;

public class Library_Service {
    private final List<Book> l1 = new ArrayList<Book>();

    public void addBook(String title,String author, String generation, int copies)
    {
        l1.add(new Book(title,author,generation,copies));
        System.out.println("Book added successfully...!");
    }

    public void viewBooks()
    {
        if(l1.isEmpty())
            System.out.println("No books in library");
        l1.forEach(System.out::println);
    }

    public void searchBooks(String book)
    {
        boolean found = false;
        for(Book b : l1)
        {
            if(b.getTitle().toLowerCase().contains(book) ||
               b.getAuthor().toLowerCase().contains(book) ||
               b.getGeneration().toLowerCase().contains(book))
            {
                System.out.println("Book Found..!");
                System.out.println(b);
                found = true;
            }
        }
        if(!found)
        {
            System.out.println("No such book found..!");
        }
    }

    public void borrowBook(String title)
    {
        for(Book b : l1)
        {
            if(b.getTitle().equalsIgnoreCase(title))
            {
                if(b.getCopies() > 0)
                {
                    b.decreaseCopies();
                    System.out.println("book borrowed successfully..!");
                }
                else
                    System.out.println("Book not available..!");
                return;
            }
        }
    }

    public void returnBook(String title) {
        for (Book b : l1) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.increaseCopies();
                System.out.println("Book returned successfully..!");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
