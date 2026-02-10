package myjava;

/**
 * Represents a Sphere with methods to calculate its volume and surface area.
 * This class ensures diameter validation and follows industry-standard practices.
 * 
 * Author: Siddesha ( Java SDET)
 */
public class Spherev1 {

    private double diameter;

    /**
     * Constructor to initialize Sphere with a given diameter.
     * @param diameter Diameter of the sphere (must be positive).
     * @throws IllegalArgumentException if diameter is non-positive.
     */
    public Spherev1(double diameter) {
        setDiameter(diameter);
    }

    /**
     * Returns the diameter of the sphere.
     * @return diameter
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * Sets the diameter of the sphere.
     * @param diameter Diameter value (must be positive).
     * @throws IllegalArgumentException if diameter is non-positive.
     */
    public void setDiameter(double diameter) {
        if (diameter <= 0) {
            throw new IllegalArgumentException("Diameter must be positive.");
        }
        this.diameter = diameter;
    }

    /**
     * Calculates the volume of the sphere using formula:
     * V = (4/3) * π * r^3
     * @return volume of sphere
     */
    public double calculateVolume() {
        double radius = diameter / 2.0;
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Calculates the surface area of the sphere using formula:
     * A = 4 * π * r^2
     * @return surface area of sphere
     */
    public double calculateSurfaceArea() {
        double radius = diameter / 2.0;
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Sphere [diameter=" + diameter + "]";
    }
}