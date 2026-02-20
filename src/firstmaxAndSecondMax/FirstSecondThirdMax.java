package firstmaxAndSecondMax;

public class FirstSecondThirdMax {

    public static void main(String[] args) {
        
        int a[] = {10, 1, 30, 25, 8, 22};
        
        // Initialize all three maximums to the smallest possible integer
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        
        // Loop through each number in the array
        for (int num : a) {
            
            // Case 1: Found a new maximum
            if (num > firstMax) {
                thirdMax = secondMax;   // shift down
                secondMax = firstMax;   // shift down
                firstMax = num;         // update firstMax
            } 
            
            // Case 2: Number lies between firstMax and secondMax
            else if (num > secondMax && num < firstMax) {
                thirdMax = secondMax;   // shift down
                secondMax = num;        // update secondMax
            } 
            
            // Case 3: Number lies between secondMax and thirdMax
            else if (num > thirdMax && num < secondMax) {
                thirdMax = num;         // update thirdMax
            }
        }
        
        // Print results
        System.out.println("First Max: " + firstMax);
        System.out.println("Second Max: " + secondMax);
        System.out.println("Third Max: " + thirdMax);
    }
}