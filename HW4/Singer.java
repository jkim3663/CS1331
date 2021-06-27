/**
 * A class that extends the abstract BandMember class. Checks singers' information and performance.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public class Singer extends BandMember {
    /**
     * Enumerator that stores ranges of singers from bass to soprano.
     */
    public enum Range {
        BASS, BARITONE, TENOR, ALTO, SOPRANO
    }

    private Range range;

    /**
     * a constructor that takes in name, talent and range.
     *
     * @param name   name of the singer
     * @param talent talent score of the singer from 1 to 5
     * @param range  the style of singer represented by range.
     */
    public Singer(String name, int talent, Range range) {
        super(name, talent);
        this.range = range;
    }

    /**
     * An overridden method that represents the singer's performance.
     *
     * @return the performance score
     */
    @Override
    public int perform() {
        int random = (int) (Math.random() * 10 + 1);
        int performance = this.getTalent();
        performance += random;
        int highnote = (int) (Math.random() * 10);
        if (highnote == 5) {
            performance *= 2;
        }
        if (performance > 10) {
            performance = 10;
        }
        if (performance < 5) {
            System.out.printf("%s's voice  cracked in the middle of their performance! Score: %d/10",
                    getName(), performance);
        } else {
            System.out.println(getName() + " sang their heart out! Score: " + performance + "/10");
        }
        return performance;
    }

    /**
     * @return a string that represents the Singer class.
     */
    public String toString() {
        return this.getName() + ": " + this.getTalent() + "/5 " + this.range;
    }

    /**
     * This is a equals method that specifically checks if the Singers' objects equal.
     *
     * @param o an object used for casting and comparison.
     * @return a boolean value if the objects are equal or not.
     */
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (!(o instanceof Singer)) {
            return false;
        } else {
            if (getClass() != o.getClass()) {
                return false;
            } else {
                Singer singer = (Singer) o;
                return getName() == singer.getName() && getTalent() == singer.getTalent() && range == singer.range;
            }
        }
    }

    /**
     * @return the performance score
     */
    public Range getRange() {
        return range;
    }
}
