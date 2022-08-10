package Libraries.Book.Types;

public class Book {
    private final int id;
    private final String title;
    private final String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    /**
     * Method that prints the contents of this Book object to the console
     * Makes use of the toString() method
     */
    public void displayBook() {
        System.out.println(this);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Title: " + title + "\n" +
                "Author: " + author;
    }
}
