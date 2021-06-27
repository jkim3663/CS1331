/**
 * NotAnArtistException class that handles exception.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public class NotAnArtistException extends Throwable {

    /**
     * Constructor for handling non-artist exceptions.
     */
    public NotAnArtistException() {
        System.out.println("That is not an artist we know!");
    }
}
