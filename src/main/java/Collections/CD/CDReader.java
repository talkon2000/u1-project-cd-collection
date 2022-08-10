package Collections.CD;

import Collections.CD.Types.Cd;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a utility class with one method that should parse the data from an input file into a list of Cds
 */
public class CDReader {
    /**
     * This method should read every line in the file and create a number of Cd objects
     * @param filename: file to get data from
     * @return a new list of every created Cd object
     */
    public List<Cd> getAllCds(String filename) {
        List<Cd> cdsList = new ArrayList<>();
        InputStream input = this.getClass().getClassLoader().getResourceAsStream(filename);

        BufferedReader reader = new BufferedReader(new InputStreamReader(input));

        String line;
        while ((line = reader.readLine()) != null) {
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
