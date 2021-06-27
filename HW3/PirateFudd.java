import java.util.Scanner;

/**
 * A class translating words to sound like a pirate or Elmer Fudd. Asks the users for inputs and translates.
 *
 * @author Jun Yeop Kim
 * @version 1.0
 */
public class PirateFudd {
    private static History h = new History();
    /**
     * Calls a history class that stores translation results as strings.
     */

    /**
     * Gets the input and prints the result of the entire code.
     *
     * @param args the user input which is before translation
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputSentence;
        int countIteration = 0;
        char q1;
        do {
            System.out.print("Input English Sentence: ");
            inputSentence = sc.nextLine();
            Translation t = new Translation(inputSentence);
            do {
                System.out.print("Pirate (Y/N): ");
                q1 = sc.nextLine().charAt(0);
                if (q1 == 'Y') {
                    System.out.println(t.translatePirate());
                    break;
                } else if (q1 == 'N') {
                    break;
                }
            } while (q1 != 'Y' && q1 != 'N');
            do {
                System.out.print("Elmer Fudd (Y/N): ");
                q1 = sc.nextLine().charAt(0);
                if (q1 == 'Y') {
                    System.out.println(t.translateFudd());
                    break;
                } else if (q1 == 'N') {
                    break;
                }
            } while (q1 != 'Y' && q1 != 'N');
            h.addRecord(inputSentence);
            System.out.println("Past Translations:");
            if (countIteration > 0) {
                h.getHistory();
            }
            countIteration++;
            do {
                System.out.println();
                System.out.print("Would you like to translate again (Y/N)? ");
                q1 = sc.nextLine().charAt(0);
            } while (q1 != 'Y' && q1 != 'N');
        } while (q1 == 'Y');
    }
}
