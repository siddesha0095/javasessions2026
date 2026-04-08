package day90sdetquestions;


import java.util.Arrays;

public class Day26MinimumCharacterReplacementInAString {
    public static void main(String[] args) {
        // Input array of strings to check
        String data[] = { "ab", "aab", "abb", "abab", "abaaaba" };
        int result[] = new int[data.length];

        // Loop through each string in the data array
        for (int w = 0; w < data.length; w++) {
            String input = data[w];
            int count = 0;
            int index = 1;

            // Logic to find minimum replacements for current string
            while (index < input.length()) {
                if (input.charAt(index) == input.charAt(index - 1)) {
                    count = count + 1; // Replacement required
                    index = index + 2; // Jump 2 positions to skip the "replaced" char
                } else {
                    index = index + 1;
                }
            }
            // Store the count for the current string in the result array
            result[w] = count;
        }

        // Print the final result array: [0, 1, 1, 0, 1]
        System.out.println(Arrays.toString(result));
    }
}

