package Libraries.CD;

import Libraries.CD.Types.Cd;
import Libraries.CD.Types.CdLibrary;
import Libraries.LibraryDriverImpl;

import java.util.List;

public class CDDriver implements LibraryDriverImpl<CdLibrary> {

    @Override
    public CdLibrary getLibrary(String filename) {
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