
import java.util.ArrayList;

/**
 * A Band class that has information about each band and the band's talent and performance.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public class Band {
    private String bandName;
    private String genre;
    private ArrayList<BandMember> members;
    private int countPerform = 0;

    /**
     * Constructor that takes bandmembers and their talent.
     *
     * @param bandName a String that represents the band name
     * @param genre    a String that shows the band's genre
     * @param members  arraylist of band members
     */
    public Band(String bandName, String genre, ArrayList<BandMember> members) {
        this.bandName = bandName;
        this.genre = genre;
        this.members = members;
    }

    /**
     * A method that calculates the average talent score of the band.
     *
     * @return the average talent score
     */
    public double talentRating() {
        double sum = 0;
        int cnt = 0;
        if (members.isEmpty()) {
            return 1;
        }
        for (BandMember bm : members) {
            sum += bm.getTalent();
            cnt++;
        }
        return sum / cnt;
    }

    /**
     * A method that calculates the average performance score of the band.
     *
     * @return the average performance score
     */
    public double perform() {
        double sum = 0;
        int cnt = 0;
        for (BandMember bm : members) {
            sum += bm.perform();
            cnt++;
        }
        System.out.printf("%s's Performance Score: %.2f/10\n", bandName, sum / cnt);
        return sum / cnt;
    }

    /**
     * @return a string that represents the Band class.
     */
    public String toString() {
        String total = bandName + " (" + genre + ")" + ": " + talentRating() + "/5\n";
        for (BandMember bm : members) {
            if (bm instanceof Singer) {
                Singer s = (Singer) bm;
                total += s.getName() + ": " + s.getTalent() + "/5 " + s.getRange() + "\n";
            }
            if (bm instanceof Guitarist) {
                Guitarist gt = (Guitarist) bm;
                total += gt.getName() + ": " + gt.getTalent() + "/5 " + gt.getSpecialization() + "\n";
            }
        }
        return total;
    }

    /**
     * @return the String value of band name.
     */
    public String getBandName() {
        return bandName;
    }

    /**
     * @return the arraylist of band members.
     */
    public ArrayList<BandMember> getMembers() {
        return members;
    }
}
