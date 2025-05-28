package service;

import model.Book;
import java.util.*;

public class Libraryservice {
    private final Map<String, Book> books = new HashMap<>();

    private String normalize(String input) {
        if (input == null) return "";
        return input.trim().replaceAll("\\s{2,}", " ");
    }

    public String generateKey(String title, String author, String generation) {
        return normalize(title).toLowerCase() + "|" +
                normalize(author).toLowerCase() + "|" +
                normalize(generation).toLowerCase();
    }

    public void addBook(String title, String author, String generation, int copies) {
        if (copies <= 0) {
            System.out.println("Number of copies must be greater than zero.");
            return;
        }

        title = normalize(title);
        author = normalize(author);
        generation = normalize(generation);

        String key = generateKey(title, author, generation);

        if (books.containsKey(key)) {
            Book b = books.get(key);
            b.setCopies(b.getCopies() + copies);
            System.out.println("Book already exists, increased the number of copies.");
        } else {
            books.put(key, new Book(title, author, generation, copies));
            System.out.println("Book added.");
        }
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in inventory.");
        } else {
            books.values().forEach(System.out::println);
        }
    }

    public void searchBooks(String query) {
        boolean found = false;
        String search = normalize(query).toLowerCase();

        for (Book b : books.values()) {
            if (b.getTitle().toLowerCase().contains(search) ||
                    b.getAuthor().toLowerCase().contains(search) ||
                    b.getGeneration().toLowerCase().contains(search)) {
                System.out.println(b);
                found = true;
            }
        }

        if (found) {
            System.out.println("Matching books found.");
        } else {
            System.out.println("No matching books found.");
        }
    }

    public void borrowBook(String title, String author, int copies, String generation) {
        if (copies <= 0) {
            System.out.println("Number of copies must be greater than zero.");
            return;
        }

        title = normalize(title);
        author = normalize(author);
        generation = normalize(generation);

        String key = generateKey(title, author, generation);
        Book b = books.get(key);

        if (b != null) {
            if (b.getCopies() >= copies) {
                b.decreaseCopies(copies);
                System.out.println("Book borrowed successfully.");
            } else {
                System.out.println("Not enough copies available.");
            }
        } else {
            System.out.println("No exact match found for the book!");

            boolean suggestionFound = false;
            for (Book book : books.values()) {
                if (book.getTitle().toLowerCase().contains(title.toLowerCase()) ||
                        book.getAuthor().toLowerCase().contains(author.toLowerCase()) ||
                        book.getGeneration().toLowerCase().contains(generation.toLowerCase())) {
                    if (!suggestionFound) {
                        System.out.println("Did you mean:");
                        suggestionFound = true;
                    }
                    System.out.println("- " + book);
                }
            }

            if (!suggestionFound) {
                System.out.println("No similar books found.");
            }
        }
    }

    public void returnBook(String title, String author, int copies, String generation) {
        if (copies <= 0) {
            System.out.println("Number of copies must be greater than zero.");
            return;
        }

        title = normalize(title);
        author = normalize(author);
        generation = normalize(generation);

        String key = generateKey(title, author, generation);
        Book b = books.get(key);

        if (b != null) {
            if (b.getCopies() + copies > b.getMaxcopies()) {
                System.out.println("Cannot return more copies than total owned.");
                return;
            }
            b.increaseCopies(copies);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("No such book found.");
        }
    }
}
