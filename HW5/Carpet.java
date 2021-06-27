/**
 * Carpet class which is about carpet items.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public class Carpet extends MagicItem implements Rechargeable {
    private double height;

    /**
     * Constructor for carpets.
     *
     * @param name   name of magic item
     * @param power  amount of power
     * @param height height of the carpet
     */
    public Carpet(String name, int power, double height) {
        super(name, power);
        this.height = height;
    }

    /**
     * Recharges the item's power.
     *
     * @param restore recharge power by this value
     */
    @Override
    public void recharge(int restore) {
        setPower(getPower() + restore);
    }

    /**
     * Method for invoking, printing results inside.
     */
    @Override
    public void invoke() {
        if (getPower() < 10) {
            System.out.println("Not enough power");
        } else {
            setPower(getPower() - 10);
            height += 10;
            System.out.printf("We're %.2f meters off the ground!\n", height);
        }
    }

    /**
     * Method that changes height to 0.
     */
    public void land() {
        height = 0;
        System.out.println("We landed");
    }

    /**
     * Returns the string representation of class.
     *
     * @return string that represents class
     */
    public String toString() {
        return "Carpet: " + super.toString();
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
        } else if (!(o instanceof Carpet)) {
            return false;
        } else {
            Carpet cp = (Carpet) o;
            return getName() == cp.getName() && getPower() == cp.getPower() && height == cp.height;
        }
    }
}
