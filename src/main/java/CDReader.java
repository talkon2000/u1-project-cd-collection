import Types.Cd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CDReader {
    String filename;

    public CDReader(String filename) {
        this.filename = filename;
    }

    public List<Cd> getAllCds() throws IOException {
        InputStream input = this.getClass().getClassLoader().getResourceAsStream(filename);
        assert input != null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));

        List<Cd> cdsList = new ArrayList<>();
        String line;
        while ( (line = reader.readLine()) != null) {
            // TODO process the line
            // Remember, the 5th line of each CD will tell you how many songs are part of that CD
            // See the CDReader hint for more help.
            // TODO create the CD and add to list
        }
        System.out.println("Reached end of file");
        reader.close();

        return cdsList;
    }
}
