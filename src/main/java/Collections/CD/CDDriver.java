package Collections.CD;

import Collections.CD.Types.Cd;
import Collections.CD.Types.CdCollection;

import java.util.List;

public class CDDriver {

    public CdCollection getCdCollection(String filename) {
        CDReader cdReader = new CDReader();
        List<Cd> cdsList = cdReader.getAllCds(filename);
        if (cdsList == null) {
            System.out.println("Exiting...");
            System.exit(0);
        }

        CdCollection collection = new CdCollection();
        for (Cd cd : cdsList) {
            collection.addCD(cd);
        }
        return collection;
    }
}
