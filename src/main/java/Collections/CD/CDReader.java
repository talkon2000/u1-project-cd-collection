package Collections.CD;

import Collections.CD.Types.Cd;
import Collections.CD.Types.Song;

import java.io.BufferedReader;
import java.io.IOException;
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

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String title = "";
            String artist = "";
            int year = 0;
            int rating = 0;
            int numOfSongs = 0;
            String songLength = "";
            String songTitle = "";
            Cd cd = null;

            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                switch (index) {
                    case 0: title = line;
                            break;
                    case 1: artist = line;
                            break;
                    case 2: year = Integer.parseInt(line);
                            break;
                    case 3: rating = Integer.parseInt(line);
                            break;
                    case 4: numOfSongs = Integer.parseInt(line);
                            break;
                    case 5: cd = new Cd(title, artist, year, rating, numOfSongs);

                    default: String[] splitLine = line.split(",");
                            songLength = splitLine[1];
                            songTitle = splitLine[0];
                            cd.addSong(new Song(songLength, songTitle));
                            break;
                }
                index++;
                if (index == numOfSongs + 5) {
                    cdsList.add(cd);
                    index = 0;
                }
            }

            System.out.println("Reached end of file");
            reader.close();
        }
        catch (IOException | NullPointerException e) {
            System.out.println("An Exception occurred, so the file could not be read.");
            return null;
        }

        return cdsList;
    }
}
