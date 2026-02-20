package twopointerapproach;

import java.util.Arrays;

/**
 * ============================================================
 *  Reverse String using Two Pointer Approach
 * ============================================================
 *
 *  PROBLEM:
 *      Reverse a given string in-place.
 *
 *  APPROACH:
 *      1. String is immutable → cannot modify directly
 *      2. Convert to char[] for in-place manipulation
 *      3. Use two pointers (left & right)
 *      4. Swap until pointers meet
 *
 *  COMPLEXITY:
 *      Time  : O(n)
 *      Space : O(1)  (in-place swap, no extra memory)
 *
 *  WHY TWO POINTER?
 *      - Fast
 *      - Memory efficient
 *      - Common interview pattern
 *
 *  INTERVIEW TIP:
 *      Mention:
 *      "Since String is immutable, I convert to char array and
 *       apply two-pointer in-place swap for O(1) space."
 *
 * ============================================================
 */
public class ReverseStringTwoPointerDocumenation {

    public static void main(String[] args) {

        /*
         * ============================================================
         * STEP 1: Input String
         * ============================================================
         * IMPORTANT:
         * - String is immutable
         * - Cannot modify directly
         */
        String input = "Hello";


        /*
         * ============================================================
         * STEP 2: Convert to char array
         * ============================================================
         * WHY?
         * - char[] is mutable
         * - allows swapping
         * - better performance than StringBuilder in interviews
         */
        char[] charArray = input.toCharArray();


        /*
         * PRINTING DIFFERENCE (Important Interview Point)
         * ----------------------------------------------
         * println(char[])           -> prints like string
         * Arrays.toString(char[])   -> prints actual array structure
         */
        System.out.println(charArray);
        System.out.println("Array structure (debug view): " + Arrays.toString(charArray));


        /*
         * ============================================================
         * STEP 3: Two Pointer Initialization
         * ============================================================
         * left  -> start index
         * right -> end index
         */
        int left = 0;
        int right = charArray.length - 1;


        /*
         * ============================================================
         * STEP 4: Swap until pointers cross
         * ============================================================
         * CONDITION:
         *      while(left < right)
         *
         * LOGIC:
         *      swap(arr[left], arr[right])
         *      left++
         *      right--
         *
         * MEMORY:
         *      temp variable used for safe swapping
         */
        while (left < right) {

            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }


        /*
         * ============================================================
         * STEP 5: Output
         * ============================================================
         */
        System.out.println(charArray);
        System.out.println("Reversed (array view): " + Arrays.toString(charArray));
    }
}
