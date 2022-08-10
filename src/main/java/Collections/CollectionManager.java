package Collections;

import Collections.Book.BookDriver;
import Collections.Book.Types.BookCollection;
import Collections.CD.CDDriver;
import Collections.CD.Types.CdCollection;

public class CollectionManager {

    public static void main(String[] args) {
        CdCollection cdCollection = getCdCollectionFromDriver(new CDDriver());
        BookCollection bookCollection = getBookCollectionFromDriver(new BookDriver());
    }

    private static CdCollection getCdCollectionFromDriver(CDDriver cdDriver) {
        return cdDriver.getCdCollection("cds_short.txt");
    }

    private static BookCollection getBookCollectionFromDriver(BookDriver bookDriver) {
        return bookDriver.getBookCollection("gutenberg_books.csv");
    }
}
