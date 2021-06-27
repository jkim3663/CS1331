/**
 * A class that extends the abstract BandMember class. Checks guitarists' information and performance.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public class Guitarist extends BandMember {
    /**
     * Enumerator that stores specialities of guitarists, which are either Acoustic or Electric.
     */
    public enum Specialty {
        ACOUSTIC, ELECTRIC;
    }

    private Specialty specialization;

    /**
     * a constructor that takes in name, talent and range.
     *
     * @param name           name of the guitarist
     * @param talent         talent score of the guitarist from 1 to 5
     * @param specialization the style of guitarist represented by specilization.
     */
    public Guitarist(String name, int talent, Specialty specialization) {
        super(name, talent);
        this.specialization = specialization;
    }

    /**
     * An overridden method that represents the guitarist's performance.
     *
     * @return the performance score
     */
    @Override
    public int perform() {
        int random = (int) (Math.random() * 10 + 1);
        int performance = this.getTalent();
        performance += random;
        int luckysolo = (int) (Math.random() * 10);
        if (luckysolo < 3) {
            performance += this.getTalent();
        }
        if (performance > 10) {
            performance = 10;
        }
        if (performance < 5) {
            System.out.printf("%s's fingers slipped and hit the wrong note! Socre: %d/10", this.getName(), performance);
        } else {
            System.out.println(this.getName() + " captured everyone's attention! Score: " + performance + "/10");
        }
        return performance;
    }

    /**
     * @return a string that represents the Guitarist class.
     */
    public String toString() {
        return this.getName() + ": " + this.getTalent() + "/5 " + specialization;
    }

    /**
     * This is a equals method that specifically checks if the Guitarists' objects equal.
     *
     * @param o an object used for casting and comparison.
     * @return the boolean value if the objects are equal or not.
     */
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (!(o instanceof Guitarist)) {
            return false;
        } else {
            if (getClass() != o.getClass()) {
                return false;
            } else {
                Guitarist g = (Guitarist) o;
                return getName() == g.getName() && getTalent() == g.getTalent() && specialization == g.specialization;
            }
        }
    }

    /**
     * @return the specialization
     */
    public Specialty getSpecialization() {
        return specialization;
    }
}
