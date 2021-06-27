import java.util.Scanner;

/**
 * Wand class which is about wand items.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public class Wand extends MagicItem implements Rechargeable {
    private String owner;

    /**
     * Constructor for wands.
     *
     * @param name  name of magic item
     * @param power amount of power
     * @param owner name of the true owner of wand
     */
    public Wand(String name, int power, String owner) {
        super(name, power);
        this.owner = owner;
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
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String input = sc.nextLine();
        if (input.equals(owner)) {
            System.out.println("I'm sorry, you are not the true owner");
        } else if (getPower() >= 25) {
            System.out.println("FIREBALL!");
            setPower(getPower() - 25);
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
        return "Wand: " + super.toString();
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
        } else if (!(o instanceof Wand)) {
            return false;
        } else {
            Wand w = (Wand) o;
            return getName() == w.getName() && getPower() == w.getPower() && owner == w.owner;
        }
    }

}
