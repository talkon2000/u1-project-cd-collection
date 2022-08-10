package Libraries.Book;

import Libraries.Book.Types.Book;
import Libraries.Book.Types.BookLibrary;
import Libraries.LibraryDriverImpl;

import java.util.List;

public class BookDriver implements LibraryDriverImpl<BookLibrary> {

    @Override
    public BookLibrary getLibrary(String filename) {
        BookReader bookReader = new BookReader();
        List<Book> booksList = bookReader.getAllBooks(filename);
        if (booksList == null) {
            System.out.println("Exiting...");
            System.exit(0);
        }
        BookLibrary library = new BookLibrary();
        for (Book book : booksList) {
            library.addItem(book);
        }
        return library;
    }
}
