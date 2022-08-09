import Types.Cd;
import Types.CdCollection;

import java.io.IOException;
import java.util.List;

public class CDDriver {

    public static void main(String[] args) {
        String filename = "cds_short.txt";
        CDReader cdReader = new CDReader();
        List<Cd> cdsList = cdReader.getAllCds(filename);

        CdCollection collection = new CdCollection();
        for (Cd cd : cdsList) {
            //TODO: add each cd to the collection
        }
    }
}
