package model;

public class Book {
    private String title;
    private String author;
    private String generation;
    private int copies;
    private int maxcopies;

    public Book(String title, String author, String generation, int copies) {
        this.title = normalize(title);
        this.author = normalize(author);
        this.generation = normalize(generation);
        this.copies = Math.max(1, copies);
        this.maxcopies =  Math.max(1, copies);;
    }

    public void decreaseCopies(int count) {
        this.copies = Math.max(0, this.copies - count);
    }

    public void increaseCopies(int count) {
        if (copies + count <= maxcopies) {
            copies += count;
        } else {
            copies = maxcopies;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = normalize(title);
    }

    public String getAuthor() {
        return author;
    }

    public int getMaxcopies() {
        return maxcopies;
    }

    public void setAuthor(String author) {
        this.author = normalize(author);
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = normalize(generation);
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = Math.max(0, copies);
    }

    private String normalize(String s) {
        return s.trim().replaceAll("\\s{2,}", " ");
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
