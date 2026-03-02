/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 *
 * This use case extends UC5 by implementing a modular approach to generate each
 * letter's pattern through dedicated methods. This enhances code reusability and
 * maintainability by separating pattern generation logic from the main display logic.
 *
 * @author Developer
 * @version 6.0
 */
public class OOPSBannerAppUC6 {

    // Extend the user story 5 to display the OOPS banner using a modular approach–
    // implementing separate methods for each letter pattern to improve code
    // reusability and maintainability.

    // Key Requirements:–
    // 1. Create separate methods to build patterns for O, P, and S using String.join()
    // 2. Call these methods at array declaration to populate the banner lines in order
    // 3. Maintain the 7-line, 9-character width alignment for each letter
    // 4. Use a loop (enhanced for loop preferred) to print each line of the banner
    // 5. Keep output visually identical to UC5 while improving reusability

    // Hint:–

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            String.join("", " ***   "),
            String.join("", "*   *  "),
            String.join("", "*   *  "),
            String.join("", "*   *  "),
            String.join("", "*   *  "),
            String.join("", "*   *  "),
            String.join("", " ***   ")
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            String.join("", " ***** "),
            String.join("", "*     *"),
            String.join("", "*     *"),
            String.join("", "****** "),
            String.join("", "*      "),
            String.join("", "*      "),
            String.join("", "*      ")
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            String.join("", "  *****"),
            String.join("", " *    "),
            String.join("", " *    "),
            String.join("", "  **** "),
            String.join("", "      *"),
            String.join("", "      *"),
            String.join("", " ***** ")
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {
        // Declare String Arrays to hold patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Use the loop to Assemble each line of the banner to create the
        // visual effect for the message "OOPS"
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + oPattern[i] + pPattern[i] + sPattern[i]);
        }
    }
}
