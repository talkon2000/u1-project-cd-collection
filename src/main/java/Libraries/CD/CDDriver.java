package Libraries.CD;

import Libraries.CD.Types.Cd;
import Libraries.CD.Types.CdLibrary;
import Libraries.LibraryDriverImpl;

import java.util.List;

public class CDDriver implements LibraryDriverImpl<CdLibrary> {
    private final String filename;

    public CDDriver(String filename) {
        this.filename = filename;
    }
    @Override
    public CdLibrary getLibrary() {
        CDReader cdReader = new CDReader();
        List<Cd> cdsList = cdReader.getAllCds(filename);
        if (cdsList == null) {
            System.out.println("Exiting...");
            System.exit(0);
        }

        CdLibrary library = new CdLibrary();
        for (Cd cd : cdsList) {
            library.addItem(cd);
        }
        return library;
    }
}
