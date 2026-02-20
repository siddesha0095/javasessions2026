package firstmaxAndSecondMax;

public class FirstMaxFirstMin {

    public static void main(String[] args) {
        
        int a[] = {10, 1, 30, 25, 8};
        
        // Initialize firstMax to the smallest possible integer
        int firstMax = Integer.MIN_VALUE;
        
        // Initialize firstMin to the largest possible integer
        int firstMin = Integer.MAX_VALUE;
        
        // Loop through each number in the array
        for (int num : a) {
            
            // If current number is greater than firstMax, update firstMax
            if (num > firstMax) {
                firstMax = num;
            }
            
            // If current number is smaller than firstMin, update firstMin
            if (num < firstMin) {
                firstMin = num;
            }
        }
        
        // Print results
        System.out.println("First Max: " + firstMax);
        System.out.println("First Min: " + firstMin);
    }
}