package Types;

public class Song {
    public String title;
    public String length;

    /**
     * Constructs a new Song object with the following fields:
     * @param title: title of song
     * @param length: length of song
     */
    public Song(String title, String length) {
        this.title = title;
        this.length = length;
    }

    /**
     * Method that prints the contents of this Song object to the console
     * Makes use of the toString() method
     */
    public void displaySong() {
        System.out.println(this);
    }

    /**
     * toString method that prints this object out in a more friendly way
     * @return a friendly string with title and length of this song
     */
    @Override
    public String toString() {
        return String.format("%s; %s", title, length);
    }
}
