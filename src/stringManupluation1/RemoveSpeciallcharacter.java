package stringManupluation1;

/**
 * The RemoveSpeciallcharacter program demonstrates how to filter out unwanted characters
 * from a string and perform additional operations such as summing digits.
 *
 * <p>Features:
 * - Keeps only alphabetic characters and spaces.
 * - Ignores special characters.
 * - Calculates the sum of all digits present in the string.
 *
 * Example:
 * Input:  "r@56vi kumar67"
 * Output: 
 *   Letters only: "rvi kumar"
 *   Sum of digits: 24
 *   Combined output: "rvi kumar 24"
 *
 * This is a common interview-style problem for practicing string manipulation in Java.
 */
public class RemoveSpeciallcharacter {

    /**
     * The main method is the entry point of the program.
     * It initializes the input string, processes each character,
     * and prints the filtered result along with the sum of digits.
     *
     * @param args Command-line arguments (not used here).
     */
    public static void main(String[] args) {
        String input = "r@56vi kumar67";

        // StringBuilder to collect only letters and spaces
        StringBuilder result = new StringBuilder();

        // Variable to hold the sum of digits
        int sum = 0;

        // Iterate through each character in the input string
        for (char c : input.toCharArray()) {

            // Keep letters and spaces
            if (Character.isLetter(c) || c == ' ') {
                result.append(c);
            }

            // Add digits to the sum
            else if (Character.isDigit(c)) {
                sum = sum + Character.getNumericValue(c);
            }
        }

        // Print results
        System.out.println(result);   // Only letters and spaces
        System.out.println(sum);      // Sum of digits
        System.out.print(result + " " + sum); // Combined output
    }
}