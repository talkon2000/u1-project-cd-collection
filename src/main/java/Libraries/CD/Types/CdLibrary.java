package Libraries.CD.Types;

import Libraries.LibraryImpl;

import java.util.ArrayList;
import java.util.List;

public class CdLibrary implements LibraryImpl<Cd> {
    private List<Cd> cds;

    /**
     * Constructor for CdLibrary. This object should hold all CDs in the Library.
     *
     */
    public CdLibrary() {
        cds = new ArrayList<>();
    }

    /**
     * Method that outputs the entire contents of the CdLibrary to the console
     * Should rely on the display* method of the Cd class
     */
    @Override
    public void displayLibrary() {
        for (Cd cd : cds) {
            cd.displayCD();
            System.out.println();
        }
    }

    /**
     * Method that sorts each Cd in the Library by its natural ordering.
     * This method may be incomplete until assignment 6
     */
    @Override
    public void sortLibrary() {
        //TODO: implement
    }

    /**
     * Method that adds a Cd object to this Library
     */
    public void addItem(Object cd) {
        if (cd.getClass() == Cd.class) {
            cds.add((Cd) cd);
        }
    }

    /**
     * Method that returns a new Library of CDs that match a particular artist
     * @param artist: artist to search for
     * @return a new Library made up of only the CDs that match the search
     */
    public CdLibrary findCdsByArtist(String artist) {
        CdLibrary searchResults = new CdLibrary();
        for (Cd cd : cds) {
            if (cd.getArtist().equals(artist)) {
                searchResults.addItem(cd);
            }
        }
        return searchResults;
    }

    /**
     * Method that searches all songs in all CDs in the Library for a particular title
     *
     * @param title: title to search for
     * @return a new list of songs that have the same title as the search
     */
    public List<Song> findSongsByTitle(String title) {
        List<Song> searchResults = new ArrayList<>();
        for (Cd cd : cds) {
            for (Song song : cd.getSongs()) {
                if (song.getTitle().equals(title)) {
                    searchResults.add(song);
                }
            }
        }
        return searchResults;
    }

    public List<Cd> getLibraryList() {
        return new ArrayList<Cd>(cds);
    }
}
