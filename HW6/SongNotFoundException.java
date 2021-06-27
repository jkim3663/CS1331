/**
 * ongNotFoundException class that handles exception.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public class SongNotFoundException extends Throwable {


    /**
     * Constructor for handling song-not-found exceptions.
     *
     * @param message message for exception.
     */
    public SongNotFoundException(String message) {
        super();
        System.out.println(message);
    }
}
