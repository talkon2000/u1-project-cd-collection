package Libraries.CD;

import Libraries.CD.Types.Cd;
import Libraries.CD.Types.CdLibrary;

import java.util.List;

public class CDDriver {

    /**
     * Method that utilizes CDReader to create CdLibrary object
     * @param filename: filename passed to CDReader
     * @return a new Library of all cds in file
     */
    public CdLibrary getCdLibrary(String filename) {
        CDReader cdReader = new CDReader();
        List<Cd> cdsList = cdReader.getAllCds(filename);

        CdLibrary library = new CdLibrary();
        for (Cd cd : cdsList) {
            //TODO: implement
        }
        return library;
    }
}
