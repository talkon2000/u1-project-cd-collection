package Libraries.CD;

import Libraries.CD.Types.Cd;
import Libraries.CD.Types.Song;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
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
        Reader csvReader = new InputStreamReader(input);

        Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(csvReader);
        for (CSVRecord record : records) {
            //Ignores header line
            if (record.getRecordNumber() == 1) {
                continue;
            }
            String artist = record.get(0);
            String title = record.get(1);
            int year = Integer.parseInt(record.get(2));
            int rating = Integer.parseInt(record.get(3));
            int numOfSongs = Integer.parseInt(record.get(4));
            Cd cd = new Cd(artist, title, year, rating, numOfSongs);

            //This loop will get all the song data for you. You just have to make it into a song object
            for (int i = 0; i < (record.size() - 5) / 2; i++) {
                String title = record.get(i * 2 + 5);
                String length = record.get(i * 2 + 6);
                cd.addSong(/*TODO: implement*/);
            }
            cdsList.add(cd);
        }
        input.close();
        System.out.println("Reached end of file");

        return cdsList;
    }

}
