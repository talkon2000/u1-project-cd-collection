package Libraries.CD;

import Libraries.CD.Types.Cd;
import Libraries.CD.Types.CdCollection;

import java.util.List;

public class CDDriver {

    /**
     * Method that utilizes CDReader to create CdCollection object
     * @param filename: filename passed to CDReader
     * @return a new collection of all cds in file
     */
    public CdCollection getCdCollection(String filename) {
        CDReader cdReader = new CDReader();
        List<Cd> cdsList = cdReader.getAllCds(filename);

        CdCollection collection = new CdCollection();
        for (Cd cd : cdsList) {
            //TODO: implement
        }
        return collection;
    }
}
