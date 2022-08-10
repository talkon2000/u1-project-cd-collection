package Collections;

import Collections.CD.CDDriver;
import Collections.CD.Types.CdCollection;

public class CollectionManager {

    public static void main(String[] args) {
        CdCollection cdCollection = getCollectionFromDriver(new CDDriver());
    }

    private static CdCollection getCollectionFromDriver(CDDriver cdDriver) {
        return cdDriver.getCdCollection("cds_short.txt");
    }
}
