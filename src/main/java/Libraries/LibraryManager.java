package Libraries;

import Libraries.CD.CDDriver;
import Libraries.CD.Types.CdCollection;

public class CollectionManager {

    public static void main(String[] args) {
        CdCollection cdCollection = getCdCollectionFromDriver(new CDDriver());
    }

    private static CdCollection getCdCollectionFromDriver(CDDriver cdDriver) {
        return cdDriver.getCdCollection("cds_short.txt");
    }

}
