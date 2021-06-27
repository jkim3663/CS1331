/**
 * Stores the records of translation inputs and results.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public class History {

    private String[] storage;
    private static int count = 0;

    /**
     * Creates a String array that can store 4 string values.
     */
    public History() {
        storage = new String[4];
    }

    /**
     * Stores string values to the array. If it's called more than three times, removes the oldest value.
     *
     * @param input the user input which is before translation
     */
    public void addRecord(String input) {
        if (count > 3) {
            storage[0] = storage[1];
            storage[1] = storage[2];
            storage[2] = storage[3];
        } else if (Translation.getCountTrans() != 0) {
            storage[count] = input + " -> " + Translation.getResult();
            count++;
        }
    }

    /**
     * Prints out the translation records inside the String array.
     */
    public void getHistory() {
        if (count < 3) {
            for (int i = 0; i < count - 1; i++) {
                if (storage[i] == null) {
                    continue;
                }
                System.out.println(storage[i]);
            }
        } else if (count == 3) {
            for (int i = 0; i < 2; i++) {
                System.out.println(storage[i]);
            }
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println(storage[i]);
            }
        }
    }

}
