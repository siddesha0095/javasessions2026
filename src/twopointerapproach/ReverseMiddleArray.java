package twopointerapproach;



import java.util.Arrays;

/**
 * ==============================================================
 *  PROBLEM:
 *  Reverse ONLY the middle portion of a String array.
 *
 *  INPUT:
 *      ["Anandita", "is", "in", "the", "interview"]
 *
 *  OUTPUT:
 *      ["Anandita", "the", "in", "is", "interview"]
 *
 *  REQUIREMENT:
 *      - First and last elements must remain unchanged.
 *      - Only the internal range should be reversed.
 *
 * ==============================================================
 *
 *  APPROACH USED:
 *      Modified Two-Pointer Technique
 *
 *  WHY TWO POINTER?
 *      - In-place swapping (No extra memory)
 *      - O(1) Space Complexity
 *      - O(n) Time Complexity
 *      - Very common interview pattern
 *
 * ==============================================================
 *
 *  INTERVIEW TALKING POINTS (Important to Mention):
 *
 *  1. I used a two-pointer approach to perform in-place reversal.
 *  2. Instead of starting at index 0 and n-1, I adjusted boundaries
 *     to 1 and n-2 because first/last elements must not change.
 *  3. This avoids extra memory and keeps solution efficient.
 *  4. Time Complexity  : O(n)
 *     Space Complexity : O(1)
 *  5. Same logic applies to partial array reversal problems.
 *
 * ==============================================================
 *
 *  WHEN THIS PATTERN IS USED IN REAL PROJECTS:
 *      - Log transformations
 *      - Data reordering
 *      - Window-based processing
 *      - Test data reshaping in automation
 *
 * ==============================================================
 */
public class ReverseMiddleArray {

    public static void main(String[] args) {

        /**
         * STEP 1: Input Data
         * ----------------------------------------------------------
         * Arrays are mutable → We can modify them directly.
         * No need for StringBuilder (unlike String problems).
         */
        String[] input = {"Anandita", "is", "in", "the", "interview"};

        System.out.println("Before Manipulation : " + Arrays.toString(input));


        /**
         * STEP 2: Initialize Two Pointers
         * ----------------------------------------------------------
         * IMPORTANT INTERVIEW POINT:
         * We intentionally skip index 0 and last index.
         *
         * Instead of:
         *      left = 0
         *      right = length - 1
         *
         * We use:
         *      left = 1
         *      right = length - 2
         *
         * This restricts reversal ONLY to the middle segment.
         */
        int left = 1;
        int right = input.length - 2;


        /**
         * STEP 3: Swap Elements Until Pointers Meet
         * ----------------------------------------------------------
         * Classic Two-Pointer Loop:
         *      while(left < right)
         *
         * WHY left < right ?
         * Prevents re-swapping and ensures half traversal.
         */
        while (left < right) {

            // Temporary variable used for swapping
            String temp = input[left];

            input[left] = input[right];
            input[right] = temp;

            // Move pointers inward
            left++;
            right--;
        }


        /**
         * STEP 4: Output Result
         */
        System.out.println("After Manipulation  : " + Arrays.toString(input));
    }
}

