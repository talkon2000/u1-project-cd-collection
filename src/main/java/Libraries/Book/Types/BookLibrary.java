package Libraries.Book.Types;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private List<Book> books;

    public BookCollection() {
        books = new ArrayList<>();
    }

    /**
     * Method that outputs the entire contents of the BookCollection to the console
     * Should rely on the display* method of the Book class
     */
    public void displayBookCollection() {
        for (Book book : books) {
            book.displayBook();
        }
    }

    /**
     * Method that sorts each Book in the collection by its natural ordering.
     * This method may be incomplete until assignment 6
     */
    public void sortBookCollection() {
        //TODO: implement
    }

    /**
     * Method that adds a Book object to this collection
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Method that returns a new collection of Books that match a particular author
     * @param author: author to search for
     * @return a new collection made up of only the Books that match the search
     */
    public BookCollection findBooksByAuthor(String author) {
        BookCollection searchResults = new BookCollection();
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
