package Libraries.CD.Types;

import java.util.ArrayList;
import java.util.List;

public class Cd {

    private String title;
    private String artist;
    private int year;
    private int rating;
    private int numOfSongs;
    private List<Song> songs;

    /**
     * Constructs a new Cd object with the following fields
     * Initialize Song[] songs to size numOfSongs
     * @param title: title of cd
     * @param artist: artist of cd
     * @param rating: rating of cd
     * @param numOfSongs: number of songs on the cd
     */
    public Cd(String title, String artist, int year, int rating, int numOfSongs) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.rating = rating;
        this.numOfSongs = numOfSongs;
        songs = new ArrayList<>();
    }

    /**
     * Method that prints the contents of this CD object to the console
     * Makes use of the toString() method
     */
    public void displayCD() {
        System.out.println(this);
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    /**
     * toString method that prints this object out in a more friendly way
     * @return a friendly string with title, artist, rating, and all songs on this Cd
     */
    @Override
    public String toString() {
        String result = "Artist: " + artist + "\n" +
                        "Title: " + title + "\n" +
                        "Release year: " + year + "\n" +
                        "Rating: " + rating + "\n" +
                        "Songs: " + "\n";
        for (Song song : songs) {
            result += song + "\n";
        }
        return result.trim();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public int getRating() {
        return rating;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public List<Song> getSongs() {
        return new ArrayList<Song>(songs);
    }
}
