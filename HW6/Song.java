import java.io.File;

/**
 * Song class that takes in String and files for song.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public class Song {
    private String name;
    private String artist;
    private String genre;
    private File file;

    /**
     * Constructor for Song.
     *
     * @param name   name of song
     * @param artist name of artist
     * @param genre  name of genre
     * @param file   file for song
     */
    public Song(String name, String artist, String genre, File file) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.file = file;
    }

    /**
     * @return the String value of song name.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the String value of artist name.
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @return the String value of genre name.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @return the file value of File.
     */
    public File getFile() {
        return file;
    }

    /**
     * Returns the string representation of class.
     *
     * @return string that represents class
     */
    public String toString() {
        String s = name + " by " + artist + "\nGenre: " + genre + "\n File: " + file.getName();
        return s;
    }
}
