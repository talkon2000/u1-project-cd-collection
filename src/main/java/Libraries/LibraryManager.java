package Libraries;

import Libraries.Book.BookDriver;
import Libraries.Book.Types.BookLibrary;
import Libraries.CD.CDDriver;
import Libraries.CD.Types.CdLibrary;

public class LibraryManager {

    public static void main(String[] args) {
        CdLibrary cdLibrary = (CdLibrary) getLibraryFromDriver(new CDDriver());
        BookLibrary bookLibrary = (BookLibrary) getLibraryFromDriver(new BookDriver());
    }

    private static LibraryImpl getLibraryFromDriver(LibraryDriverImpl driver) {
        return driver.getLibrary("cds_short.csv");
    }

}
