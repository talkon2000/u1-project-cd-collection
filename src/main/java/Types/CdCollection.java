package Types;

import java.util.ArrayList;
import java.util.List;

public class CdCollection {
    public List<Cd> cds;

    /**
     * Constructor for CdCollection. This object should hold all CDs in the collection.
     *
     */
    public CdCollection() {
        cds = new ArrayList<>();
    }

    /**
     * Method that outputs the entire contents of the CdCollection to the console
     * Should rely on the display* method of the Cd class
     */
    public void displayCdCollection() {
        for (Cd cd : cds) {
            cd.displayCD();
        }
    }

    /**
     * Method that sorts each Cd in the collection by its natural ordering.
     * This method may be incomplete until assignment 6
     */
    public void sortCdCollection() {
        //TODO: implement
    }

    /**
     * Method that adds a Cd object to this collection
     */
    public void addCD(Cd cd) {
        cds.add(cd);
    }

    /**
     * Method that returns a new collection of CDs that match a particular artist
     * @param artist: artist to search for
     * @return a new collection made up of only the CDs that match the search
     */
    public CdCollection findCdsByArtist(String artist) {
        CdCollection searchResults = new CdCollection();
        for (Cd cd : cds) {
            if (cd.artist.equals(artist)) {
                searchResults.addCD(cd);
            }
        }
        return searchResults;
    }

    /**
     * Method that searches all songs in all CDs in the collection for a particular title
     *
     * @param title: title to search for
     * @return a new list of songs that have the same title as the search
     */
    public List<Song> findSongsByTitle(String title) {
        List<Song> searchResults = new ArrayList<>();
        for (Cd cd : cds) {
            for (Song song : cd.songs) {
                if (song.title.equals(title)) {
                    searchResults.add(song);
                }
            }
        }
        return searchResults;
    }
}
