/**
 * Abstract class that shows takes charge of magic items.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public abstract class MagicItem implements Comparable<MagicItem> {
    private int power;
    private String name;

    /**
     * Constructor for MagicItem.
     *
     * @param name  name of magic item
     * @param power amount of power
     */
    public MagicItem(String name, int power) {
        this.name = name;
        this.power = power;
    }

    /**
     * Abstract method for invoking.
     */
    public abstract void invoke();

    /**
     * Returns the string representation of class.
     *
     * @return string that represents class
     */
    public String toString() {
        String rtr = name + " has " + power + " power left";
        return rtr;
    }

    /**
     * Equals method that specifically checks if each objects equal.
     *
     * @param o an object used for casting and comparison.
     * @return the boolean value if the objects are equal or not.
     */
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (!(o instanceof MagicItem)) {
            return false;
        } else {
            MagicItem mi = (MagicItem) o;
            return name == mi.name && power == mi.power;
        }
    }

    /**
     * Method that compares integer values.
     *
     * @param o Integer object for comparison
     * @return 1, 0, -1 depending on the value
     */
    @Override
    public int compareTo(MagicItem o) {
       if (power > o) {
            return 1;
        } else if (power == o) {
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * @return the String value of item name.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the int value of power name.
     */
    public int getPower() {
        return power;
    }

    /**
     * Method that sets power.
     *
     * @param power int value of power
     */
    public void setPower(int power) {
        this.power = power;
    }
}
