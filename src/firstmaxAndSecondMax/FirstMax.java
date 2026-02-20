package firstmaxAndSecondMax;

public class FirstMax {

    public static void main(String[] args) {
        
        int a[] = {10, 1, 30, 25, 8};
        
        // Initialize firstMax to the smallest possible integer
        int firstMax = Integer.MIN_VALUE;
        
        // Loop through each number in the array
        for (int num : a) {
            
            // If current number is greater than firstMax, update firstMax
            if (num > firstMax) {
                firstMax = num;
            }
        }
        
        // Print result
        System.out.println("First Max: " + firstMax);
    }
}
