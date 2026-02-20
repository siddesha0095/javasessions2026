package firstmaxAndSecondMax;

public class FirstMin {

    public static void main(String[] args) {
        
        int a[] = {10, 1, 30, 25, 8};
        
        // Initialize firstMin to the largest possible integer
        int firstMin = Integer.MAX_VALUE;
        
        // Loop through each number in the array
        for (int num : a) {
            
            // If current number is smaller than firstMin, update firstMin
            if (num < firstMin) {
                firstMin = num;
            }
        }
        
        // Print result
        System.out.println("First Min: " + firstMin);
    }
}