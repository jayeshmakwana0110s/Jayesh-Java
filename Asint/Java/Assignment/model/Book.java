package model;

public class Book {
    private String title;
    private String author;
    private String generation;
    private int copies;

    public Book(String title, String author, String generation, int copies) {
        this.title = title;
        this.author = author;
        this.generation = generation;
        this.copies = copies;
    }

    public void decreaseCopies() {
        this.copies--;
    }

    public void increaseCopies() {
        this.copies++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", generation='" + generation + '\'' +
                ", copies=" + copies +
                '}';
    }
}
