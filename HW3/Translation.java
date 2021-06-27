/**
 * Translates the user input Strings into pirtate style, Elmer Fudd style, or both.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public class Translation {

    private String s;
    private String[] words;
    private static String result;
    private static int count = 0;
    private static int countTrans = 0;

    /**
     * Constructs translation by determining if it is pirate style or Fudd style and tracing chars inside string.
     * String s gets divided into an array by string array words, and get a string result at the final.
     *
     * @param s the inp private String newSentence
     */
    public Translation(String s) {
        this.s = s;
    }

    /**
     * Translates into the pirate version of words.
     *
     * @return the pirate translated version
     */
    public String translatePirate() {
        result = "";
        words = s.toLowerCase().split(" ");
        for (int idx = 0; idx < words.length; idx++) {
            if (words[idx].startsWith("you")) {
                words[idx] = words[idx].replace("you", "ye");
            }
            if (words[idx].endsWith("ing")) {
                words[idx] = words[idx].replace("ing", "in'");
            }
            if (words[idx].equals("and")) {
                words[idx] = "'n";
            }
            if (words[idx].equals("my")) {
                words[idx] = "me";
            }
            if (words[idx].equals("is")) {
                words[idx] = "be";
            }
            if (words[idx].equals("are")) {
                words[idx] = "be";
            }
            if (words[idx].equals("am")) {
                words[idx] = "be";
            }
        }
        for (int i = 0; i < words.length; i++) {
            result += words[i] + " ";
        }
        result = "Yarr! " + result.substring(0, 1).toUpperCase() + result.substring(1);
        count++;
        countTrans++;
        return result;
    }

    /**
     * Translates in to the Elmer Fudd version of words.
     *
     * @return the Fudd translated version
     */
    public String translateFudd() {
        if (count != 0) {
            result = result.replace("th", "d");
            result = result.replace("l", "w");
            result = result.replace("ith", "if");
            result = result.replace("r", "w");
            count--;
            return result;
        } else {
            result = "";
            words = s.toLowerCase().split(" ");
            for (int idx = 0; idx < words.length; idx++) {
                words[idx] = words[idx].replace("th", "d");
                words[idx] = words[idx].replace("l", "w");
                words[idx] = words[idx].replace("ith", "if");
                words[idx] = words[idx].replace("r", "w");
            }
            for (int i = 0; i < words.length; i++) {
                result += words[i] + " ";
            }
            result = result.substring(0, 1).toUpperCase() + result.substring(1);
            countTrans++;
            return result;
        }
    }

    /**
     * @return the final translation result
     */
    public static String getResult() {
        return result;
    }

    /**
     * @return the number of translations, which is used for the History class.
     * */
    public static int getCountTrans() {
        return countTrans;
    }
}