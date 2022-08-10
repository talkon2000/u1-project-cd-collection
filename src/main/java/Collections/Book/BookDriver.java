package Collections.Book;

import Collections.Book.Types.Book;
import Collections.Book.Types.BookCollection;

import java.util.List;

public class BookDriver {

    public BookCollection getBookCollection(String filename) {
        BookReader bookReader = new BookReader();
        List<Book> booksList = bookReader.getAllBooks(filename);
        if (booksList == null) {
            System.out.println("Exiting...");
            System.exit(0);
        }
        BookCollection collection = new BookCollection();
        for (Book book : booksList) {
            collection.addBook(book);
        }
        return collection;
    }
}
