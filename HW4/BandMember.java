/**
 * An abstract class about bandmembers and their talent scores.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public abstract class BandMember {
    private String name;
    private int talent;

    /**
     * Constructor that takes bandmembers and their talent.
     *
     * @param name   bandmember
     * @param talent score of bandmember's talent from 1 to 5
     */
    public BandMember(String name, int talent) {
        this.name = name;
        this.talent = talent;
        if (talent < 1) {
            this.talent = 1;
        }
        if (talent > 5) {
            this.talent = 5;
        }
    }

    /**
     * This is an abstract method. Child classes must implement this method,
     * @return a score about of 10 for the performance.
     */
    public abstract int perform();

    /**
     * @return a string that represents the BandMember class.
     */
    public String toString() {
        return name + ": " + talent + "/5";
    }

    /**
     * This is a equals method that specifically checks if the Bandmembers' objects equal.
     *
     * @param o an object used for casting and comparison.
     * @return the boolean value if it is same or not.
     */
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (!(o instanceof BandMember)) {
            return false;
        } else {
            if (getClass() != o.getClass()) {
                return false;
            } else {
                BandMember bm = (BandMember) o;
                return name == bm.name && talent == bm.talent;
            }
        }
    }

    /**
     * @return the String value name.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the int value talent.
     */
    public int getTalent() {
        return this.talent;
    }

    /**
     * @param tlt the input talent value
     * @return the setting of int value talent.
     */
    public int setTalent(int tlt) {
        this.talent = tlt;
        return this.talent;
    }
}
