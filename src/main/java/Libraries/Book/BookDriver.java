package Libraries.Book;

import Libraries.Book.Types.Book;
import Libraries.Book.Types.BookLibrary;

import java.util.List;

public class BookDriver {

    public final String filename;
    public BookDriver(String filename) {
        this.filename = filename;
    }

    public BookLibrary getBookLibrary() {
        BookReader bookReader = new BookReader();
        List<Book> booksList = bookReader.getAllBooks(filename);
        if (booksList == null) {
            System.out.println("Exiting...");
            System.exit(0);
        }

        BookLibrary library = new BookLibrary();
        for (Book book : booksList) {
            library.addBook(book);
        }
        return library;
    }
}
