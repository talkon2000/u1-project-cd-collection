package Libraries;

import Libraries.Book.BookDriver;
import Libraries.Book.Types.BookLibrary;
import Libraries.CD.CDDriver;
import Libraries.CD.Types.CdLibrary;

public class LibraryManager {

    public static void main(String[] args) {
        CdLibrary cdLibrary = (CdLibrary) getLibraryFromDriver(new CDDriver("cds.csv"));
        BookLibrary bookLibrary = (BookLibrary) getLibraryFromDriver(new BookDriver("gutenberg_books.csv"));
        display(cdLibrary);
        display(bookLibrary);
    }

    private static LibraryImpl getLibraryFromDriver(LibraryDriverImpl driver) {
        return driver.getLibrary();
    }

    private static void display(LibraryImpl library) {
        library.displayLibrary();
    }
}
