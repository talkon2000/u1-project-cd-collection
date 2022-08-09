import Types.Cd;
import Types.CdCollection;

import java.util.List;

public class CDDriver {

    public static void main(String[] args) {
        String filename = "cds_short.txt";
        CDReader cdReader = new CDReader();
        List<Cd> cdsList = cdReader.getAllCds(filename);
        if (cdsList == null) {
            System.out.println("Exiting...");
            return;
        }

        CdCollection collection = new CdCollection();
        for (Cd cd : cdsList) {
            collection.addCD(cd);
        }
    }
}
