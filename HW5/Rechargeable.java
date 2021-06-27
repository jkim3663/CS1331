/**
 * Interface that makes power recharged.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public interface Rechargeable {

    /**
     * Recharges the item's power.
     *
     * @param restore recharge power by this value
     */
    void recharge(int restore);
}
