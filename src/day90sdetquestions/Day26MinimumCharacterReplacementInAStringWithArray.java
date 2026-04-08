package day90sdetquestions;


/**
 * Problem: Minimum Character Replacements to ensure no two adjacent characters are identical.
 * Strategy: Greedy traversal with index skipping.
 */
public class Day26MinimumCharacterReplacementInAStringWithArray {

    /**
     * Calculates the minimum replacements needed for a given string.
     * @param input The target string to check.
     * @return The total number of replacements required.
     */
    public static int getMinReplacements(String input) {
        if (input == null || input.length() < 2) {
            return 0;
        }

        int count = 0;
        int index = 1;

        // Iterate through the string starting from the second character
        while (index < input.length()) {
            // Check if the current character matches the previous one
            if (input.charAt(index) == input.charAt(index - 1)) {
                count++; 
                
                /* 
                 * Logic: If we replace the character at 'index', we don't 
                 * need to check it against the 'index + 1' character. 
                 * Therefore, we jump ahead by 2.
                 */
                index = index + 2; 
            } else {
                // No conflict, move to the next character
                index = index + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "abaaaba";
        int result = getMinReplacements(input);
        
        System.out.println("Input String: " + input);
        System.out.println("Minimum replacements needed: " + result);
    }
}

