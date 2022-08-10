package Libraries.CD.Types;

public class Cd {

    public String title;
    public String artist;
    public int year;
    public int rating;
    public int numOfSongs;
    public Song[] songs;
    public int index;

    /**
     * Constructs a new Cd object with the following fields
     * Initialize Song[] songs to size numOfSongs
     * @param title: title of cd
     * @param artist: artist of cd
     * @param year: release year of cd
     * @param rating: rating of cd
     * @param numOfSongs: number of songs on the cd
     */
    public Cd(String title, String artist, int year, int rating, int numOfSongs) {
        //TODO: implement
    }

    /**
     * Method that prints the contents of this CD object to the console
     * Makes use of the toString() method
     */
    public void displayCD() {
        //TODO: implement
    }

    /**
     * Method that adds a song to this cd
     */
    public void addSong() {
        //TODO: implement
        //Think about what argument(s) this method should have
        //This should make use of the index field
    }

    /**
     * toString method that prints this object out in a more friendly way
     * @return a friendly string with title, artist, rating, and all songs on this Cd
     */
    @Override
    public String toString() {
        //TODO: implement
        return null;
    }
}
