package Libraries.CD;

import Libraries.CD.Types.Cd;
import Libraries.CD.Types.CdLibrary;

import java.util.List;

public class CDDriver {

    public final String filename;
    public CDDriver(String filename) {
        this.filename = filename;
    }
    /**
     * Method that utilizes CDReader to create CdLibrary object
     * @return a new Library of all cds in file
     */
    public CdLibrary getCdLibrary() {
        CDReader cdReader = new CDReader();
        List<Cd> cdsList = cdReader.getAllCds(filename);

        CdLibrary library = new CdLibrary();
        for (Cd cd : cdsList) {
            //TODO: implement
        }
        return library;
    }
}
