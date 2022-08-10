package Libraries.Book.Types;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private List<Book> books;

    public BookLibrary() {
        books = new ArrayList<>();
    }

    /**
     * Method that outputs the entire contents of the BookLibrary to the console
     * Should rely on the display* method of the Book class
     */
    public void displayBookLibrary() {
        for (Book book : books) {
            book.displayBook();
        }
    }

    /**
     * Method that sorts each Book in the Library by its natural ordering.
     * This method may be incomplete until assignment 6
     */
    public void sortBookLibrary() {
        //TODO: implement
    }

    /**
     * Method that adds a Book object to this Library
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Method that returns a new Library of Books that match a particular author
     * @param author: author to search for
     * @return a new Library made up of only the Books that match the search
     */
    public BookLibrary findBooksByAuthor(String author) {
        BookLibrary searchResults = new BookLibrary();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                searchResults.addBook(book);
            }
        }
        return searchResults;
    }

    public List<Book> getBooks() {
        return new ArrayList<Book>(books);
    }
}
