import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Driver class that use all classes and methods.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public class SongDB {
    private static ArrayList<Song> arrSong = new ArrayList<>();

    /**
     * Method for loading.
     *
     * @param file txt files inside would be used for adding to arraylist.
     * @return arraylist of song objects.
     */
    public static ArrayList<Song> load(File file) throws FileNotFoundException {
        File[] files = file.listFiles();
        if (!(file.exists()) || file == null) {
            throw new FileNotFoundException();
        }
        for (File f : files) {
            if (f.isDirectory()) {
                load(f);
            } else {
                Scanner sc = new Scanner(f);
                String artist = f.getParentFile().getName();
                String genre = f.getParentFile().getParentFile().getName();
                String songName = sc.nextLine();
                Song s = new Song(songName, artist, genre, f);
                arrSong.add(s);
            }
        }
        return arrSong;
    }

    /**
     * Method for making output data through a txt file.
     *
     * @param songs arraylist for making new txt file.
     */
    public static void outputData(ArrayList<Song> songs) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("SongDB.txt");
        for (Song s : songs) {
            pw.write(s.getName() + "\n");
            pw.write(s.getArtist() + "\n");
            pw.write(s.getGenre() + "\n");
            pw.write("\n");
        }
        pw.close();
    }

    /**
     * Method for reading data inside files and arraylists.
     *
     * @param ss    song object for checking
     * @param songs arraylist for reading songs, counting, and finding longest line.
     */
    public static void readSong(Song ss, ArrayList<Song> songs) throws FileNotFoundException, SongNotFoundException {
        if (!(songs.contains(ss))) {
            throw new SongNotFoundException(ss.getName() + " was not found in the database!");
        }
        for (Song s : songs) {
            if (s.getFile() == null) {
                throw new FileNotFoundException();
            }
            Scanner sc = new Scanner(s.getFile());
            sc.nextLine();
            sc.nextLine();
            for (int i = 0; i < 5; i++) {
                System.out.println(sc.nextLine());
            }
            System.out.println();
            System.out.println("Word Count: " + getTotalWordCount(s));
            System.out.println("Longest Line: " + getLongestLine(s));
            System.out.println();
        }
    }

    /**
     * Method for listing artsts and songs and printing songs.
     *
     * @param artist string that represents artist name
     * @param songs  arraylist for listing
     */
    public static void listArtistSongs(String artist, ArrayList<Song> songs) throws NotAnArtistException {
        int cnt = 0;
        if (songs.isEmpty()) {
            throw new NotAnArtistException();
        }
        for (Song s : songs) {
            if (s.getArtist().equals(artist)) {
                System.out.println(s.getName());
                cnt++;
            }
        }
        if (cnt == 0) {
            throw new NotAnArtistException();
        }
    }

    /**
     * Method helping readSong method.
     *
     * @param s Song object for getting longest line
     */
    private static String getLongestLine(Song s) throws FileNotFoundException {
        Scanner sc = new Scanner(s.getFile());
        String longest = sc.nextLine();
        while (sc.hasNextLine()) {
            String current = sc.nextLine();
            if (longest.length() < current.length()) {
                longest = current;
            }
        }
        sc.close();
        return longest;
    }

    /**
     * Method helping readSong method.
     *
     * @param s Song object for total word count.
     */
    private static int getTotalWordCount(Song s) throws FileNotFoundException {
        Scanner sc = new Scanner(s.getFile());
        int count = 0;
        sc.nextLine();
        while (sc.hasNext()) {
            count++;
            sc.next();
        }
        sc.close();
        return count;
    }

    /**
     * Main method to interact with program.
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        ArrayList<Song> hi = new ArrayList<>(); // empty array list for testing
        File f = new File("database_songs");
        try {
            Song song = new Song("So Not Over You", "Simply Red", "Pop", f);
            String artist = "Kenny Loggins";
            load(new File("database_songs"));
            Song song1 = arrSong.get(0);
            outputData(arrSong);
            readSong(song1, arrSong);
            listArtistSongs(artist, arrSong);
        } catch (NotAnArtistException e) {
            System.out.println(e.getMessage());
        } catch (SongNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
