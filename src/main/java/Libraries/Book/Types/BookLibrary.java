package Libraries.Book.Types;

import Libraries.LibraryImpl;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary implements LibraryImpl<Book> {
    private List<Book> books;

    public BookLibrary() {
        books = new ArrayList<>();
    }

    /**
     * Method that outputs the entire contents of the BookLibrary to the console
     * Should rely on the display* method of the Book class
     */
    @Override
    public void displayLibrary() {
        for (Book book : books) {
            book.displayBook();
            System.out.println();
        }
    }

    /**
     * Method that sorts each Book in the Library by its natural ordering.
     * This method may be incomplete until assignment 6
     */
    @Override
    public void sortLibrary() {
        //TODO: implement
    }

    /**
     * Method that adds a Book object to this Library
     */
    @Override
    public void addItem(Object book) {
        if(book.getClass() == Book.class) {
            books.add((Book) book);
        }
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
                searchResults.addItem(book);
            }
        }
        return searchResults;
    }

    @Override
    public List<Book> getLibraryList() {
        return new ArrayList<Book>(books);
    }
}
