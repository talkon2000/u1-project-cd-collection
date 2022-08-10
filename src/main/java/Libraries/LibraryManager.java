package Libraries;

import Libraries.CD.CDDriver;
import Libraries.CD.Types.CdLibrary;

public class LibraryManager {

    public static void main(String[] args) {
        CdLibrary cdLibrary = getCdLibraryFromDriver(new CDDriver());
    }

    private static CdLibrary getCdLibraryFromDriver(CDDriver cdDriver) {
        return cdDriver.getCdLibrary("cds_short.txt");
    }

}
