package firstmaxAndSecondMax;

import java.util.Arrays;

public class SortArrayDecreasingManual {

    public static void main(String[] args) {
        
        int a[] = {10, 1, 30, 25, 8};
        
        // Sort in ascending order
        Arrays.sort(a);
        
        // Print in reverse order
        System.out.print("Array in decreasing order: [");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println("]");
    }
}