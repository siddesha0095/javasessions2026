package firstmaxAndSecondMax;

public class BubbleSortIncreasing {

    public static void main(String[] args) {
        
        int a[] = {10, 1, 30, 25, 8};
        
        // Bubble Sort Algorithm
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap elements
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        
        // Print sorted array
        System.out.print("Sorted in increasing order: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}