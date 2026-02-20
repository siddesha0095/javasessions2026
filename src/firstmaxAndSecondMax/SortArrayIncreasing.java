package firstmaxAndSecondMax;

import java.util.Arrays;

public class SortArrayIncreasing {

    public static void main(String[] args) {
        
        int a[] = {10, 1, 30, 25, 8};
        
        // Use built-in sort method from java.util.Arrays
        Arrays.sort(a);  // sorts the array in ascending (increasing) order
        
        // Print the sorted array
        System.out.println("Array in increasing order: " + Arrays.toString(a));
    }
}