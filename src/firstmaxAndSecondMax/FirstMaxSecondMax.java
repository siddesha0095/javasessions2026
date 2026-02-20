package firstmaxAndSecondMax;

public class FirstMaxSecondMax {

    public static void main(String[] args) {
        
        // Input array
        int a[] = {10, 1, 30, 25, 8};
        
        // Initialize firstMax and secondMax to the smallest possible integer
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        // Loop through each number in the array
        for (int num : a) {
            
            // Case 1: Found a new maximum
            if (num > firstMax) {
                // Before updating firstMax, shift its old value into secondMax
                secondMax = firstMax;
                firstMax = num;
            } 
            
            // Case 2: Number lies between firstMax and secondMax
            else if (num > secondMax && num < firstMax) {
                secondMax = num;
            }
        }
        
        // Print results
        System.out.println("First Max: " + firstMax);
        System.out.println("Second Max: " + secondMax);
    }
}