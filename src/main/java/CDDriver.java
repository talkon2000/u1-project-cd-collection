import Types.CdCollection;

import java.io.InputStream;
import java.nio.file.Path;

public class CDDriver {
    public String fileName;
    public CdCollection collection;

    public void setup() {
        collection = new CdCollection();
        fileName = "cds_short.txt";
    }

    public static void main(String[] args) {
    }
}
