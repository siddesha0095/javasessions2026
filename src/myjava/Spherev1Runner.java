package myjava;

/**
 * Runner class to test Sphere calculations.
 */
public class Spherev1Runner {
    public static void main(String[] args) {
        try {
            Spherev1 s1 = new Spherev1(0); // Example diameter
            System.out.println(s1);
            System.out.println("Surface Area: " + s1.calculateSurfaceArea());
            System.out.println("Volume: " + s1.calculateVolume());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}