package Libraries.CD.Types;

import java.util.List;

public class CdLibrary {
    public List<Cd> cds;

    /**
     * Constructor for CdLibrary. This object should hold all CDs in the Library.
     */
    public CdLibrary() {
        //TODO: implement
    }

    /**
     * Method that outputs the entire contents of the CdLibrary to the console
     * Should rely on the display* method of the Cd class
     */
    public void displayCdLibrary() {
        //TODO: implement
    }

    /**
     * Method that sorts each Cd in the Library by its natural ordering.
     * This method may be incomplete until assignment 6
     */
    public void sortCdLibrary() {
        //TODO: implement
    }

    /**
     * Method that adds a Cd object to this Library
     */
    public void addCD() {
        //TODO: implement
        //Think about what argument(s) this method should have
        //Should it accept a cd? Or should it accept everything that creates a cd?
    }

    /**
     * Method that returns a new Library of CDs that match a particular artist
     * @param artist: artist to search for
     * @return a new Library made up of only the CDs that match the search
     */
    public CdLibrary findCdsByArtist(String artist) {
        //TODO: implement
        return null;
    }

    /**
     * Method that searches all songs in all CDs in the Library for a particular title
     * @param title: title to search for
     * @return a new list of songs that have the same title as the search
     */
    public List<Song> findSongsByTitle(String title) {
        //TODO: implement
        return null;
    }
}
