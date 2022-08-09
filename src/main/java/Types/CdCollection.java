package Types;

import java.util.List;

public class CdCollection {
    public List<Cd> cds;

    /**
     * Constructor for CdCollection. This object should hold all CDs in the collection.
     *
     */
    public CdCollection() {
        //TODO: implement
    }

    /**
     * Method that outputs the entire contents of the CdCollection to the console
     * Should rely on the display* method of the Cd class
     */
    public void displayCdCollection() {
        //TODO: implement
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
    public void addCD() {
        //TODO: implement
        //Think about what argument(s) this method should have
    }

    /**
     * Method that returns a new collection of CDs that match a particular artist
     * @param artist: artist to search for
     * @return a new collection made up of only the CDs that match the search
     */
    public CdCollection findCdsByArtist(String artist) {
        //TODO: implement
        return null;
    }

    /**
     * Method that searches all songs in all CDs in the collection for a particular title
     *
     * @param title: title to search for
     * @return a new list of songs that have the same title as the search
     */
    public List<Song> findSongsByTitle(String title) {
        //TODO: implement
        return null;
    }
}
