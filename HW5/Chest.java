import java.util.ArrayList;

/**
 * Driver class that use all magic items.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public class Chest {
    private ArrayList<MagicItem> itemsInside;

    /**
     * Constructor for Chest.
     *
     * @param itemsInside list of bands
     */
    public Chest(ArrayList<MagicItem> itemsInside) {
        this.itemsInside = itemsInside;
    }

    /**
     * Constructor for Chest where itemsInside starts empty.
     */
    public Chest() {
        itemsInside = new ArrayList<MagicItem>();
    }

    /**
     * Method that uses selection sort.
     */
    public void sortChest() {
        int max;
        for (int outer = 0; outer < itemsInside.size() - 1; outer++) {
            max = outer;
            for (int inner = outer + 1; inner < itemsInside.size(); inner++) {
                if (itemsInside.get(max).compareTo(itemsInside.get(inner).getPower()) < 0) {
                    max = inner;
                }
            }
            MagicItem temp = itemsInside.get(max);
            itemsInside.set(max, itemsInside.get(outer));
            itemsInside.set(outer, temp);
        }
    }

    /**
     * Method that adds items.
     *
     * @param item item that will be added
     */
    public void addItem(MagicItem item) {
        itemsInside.add(item);
    }

    /**
     * Method that uses binary search.
     *
     * @param item MagicItem as a parameter
     * @return the item
     */
    public MagicItem findItem(MagicItem item) {
        int left = 0;
        int right = itemsInside.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (itemsInside.get(mid).compareTo(item.getPower()) == 1) {
                left = mid + 1;
            } else if (itemsInside.get(mid).compareTo(item.getPower()) == -1) {
                right = mid - 1;
            } else {
                System.out.println("You found a " + item);
                return item;
            }
        }

        return null;
    }

    /**
     * Method that uses binary search and remove.
     *
     * @param item MagicItem as a parameter
     * @return the item removed
     */
    public MagicItem removeItem(MagicItem item) {
        int left = 0;
        int right = itemsInside.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (itemsInside.get(mid).compareTo(item.getPower()) == 0) {
                itemsInside.remove(mid);
                return item;
            } else if (itemsInside.get(mid).compareTo(item.getPower()) == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    /**
     * Method that removes the least powerful.
     *
     * @return the junk
     */
    public MagicItem removeJunk() {
        int result = -1;
        int min = itemsInside.get(0).getPower();
        for (int i = 0; i < itemsInside.size(); i++) {
            if (itemsInside.get(i).compareTo(min) < 0) {
                min = itemsInside.get(i).getPower();
                result = itemsInside.indexOf(itemsInside.get(i));
            }
        }
        System.out.println("Removed the junk");
        return itemsInside.remove(result);
    }

    /**
     * Main method to interact with program.
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        MagicItem lamp = new Lamp("l1", 65, false);
        MagicItem carpet = new Carpet("c1", 500, 140);
        MagicItem wand = new Wand("w1", 60, "Kim");
        MagicItem lamp2 = new Lamp("l2", 22, true);
        MagicItem carpet2 = new Carpet("c2", 12, 123);
//        ((Carpet) carpet).recharge(1000);
//        System.out.println(carpet); // for testing

        Chest chest = new Chest();
        chest.addItem(lamp);
        chest.addItem(carpet);
        chest.addItem(wand);
        chest.addItem(lamp2);
        chest.addItem(carpet2);

        for (int i = 0; i < chest.itemsInside.size(); i++) {
            chest.itemsInside.get(i).invoke();
        }

        chest.sortChest();
        chest.findItem(carpet);
        chest.removeItem(carpet2);
//        for (int i = 0; i < chest.itemsInside.size(); i++) {
//            System.out.println(chest.itemsInside.get(i));
//        } // for testing
        chest.removeJunk();
//        for (int i = 0; i < chest.itemsInside.size(); i++) {
//            System.out.println(chest.itemsInside.get(i));
//        } // for testing
    }

}
