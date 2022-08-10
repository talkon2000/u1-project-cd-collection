package Libraries;

import Libraries.CD.CDDriver;
import Libraries.CD.Types.CdLibrary;

public class LibraryManager {

    public static void main(String[] args) {
        CdLibrary cdLibrary = getCdLibraryFromDriver(new CDDriver("cds.csv"));
        displayCdLibrary(cdLibrary);
    }

    private static CdLibrary getCdLibraryFromDriver(CDDriver cdDriver) {
        return cdDriver.getCdLibrary();
    }

    private static void displayCdLibrary(CdLibrary cdLibrary) {
        cdLibrary.displayCdLibrary();
    }
}
