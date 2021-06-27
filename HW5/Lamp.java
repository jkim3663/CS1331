/**
 * Lamp class which is about lamp items.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public class Lamp extends MagicItem {
    private boolean genieHome;

    /**
     * Constructor for lamps.
     *
     * @param name      name of magic item
     * @param power     amount of power
     * @param genieHome boolean if genie's home or not
     */
    public Lamp(String name, int power, boolean genieHome) {
        super(name, power);
        this.genieHome = genieHome;
    }

    /**
     * Method for invoking, printing results inside.
     */
    @Override
    public void invoke() {
        if (this.genieHome) {
            System.out.println("Genie away, come back later");
        } else if (getPower() > 50) {
            System.out.println("Wish granted!");
        } else {
            System.out.println("Not enough power");
        }
    }

    /**
     * Returns the string representation of class.
     *
     * @return string that represents class
     */
    public String toString() {
        return "Lamp: " + super.toString();
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
        } else if (!(o instanceof Lamp)) {
            return false;
        } else {
            Lamp lamp = (Lamp) o;
            return getName() == lamp.getName() && getPower() == lamp.getPower() && genieHome == lamp.genieHome;
        }
    }

}
