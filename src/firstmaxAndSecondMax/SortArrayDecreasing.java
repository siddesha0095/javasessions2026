package firstmaxAndSecondMax;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayDecreasing {

    public static void main(String[] args) {
        
        Integer a[] = {10, 1, 30, 25, 8}; 
        // Note: must use Integer (object) instead of int for Collections.reverseOrder
        
        // Sort in decreasing order using reverseOrder comparator
        Arrays.sort(a, Collections.reverseOrder());
        
        // Print the sorted array
        System.out.println("Array in decreasing order: " + Arrays.toString(a));
    }
}