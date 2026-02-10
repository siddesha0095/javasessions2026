package myjava;

public class Sphere {

	private double diameter;
	private static final double PI = 3.142;

	public Sphere(double diameter) {
		if (verifyDiameter(diameter)) {
			this.diameter = diameter;
		}
		else
		{
			System.out.println("Diamter is negative PAss correct val");
		}
	}

	@Override
	public String toString() {
		return "Sphere [diameter=" + diameter + "]";
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		if (verifyDiameter(diameter)) {
			this.diameter = diameter;
		}
		else
		{
			System.out.println("Diamter is negative PAss correct val");
		}
	}

	public void CalculateVolumeOfSphere() {
		double radius = diameter / 2;
		double volumeOfSphere = (4 / 3) * PI * radius * radius * radius;
		System.out.println(volumeOfSphere);
	}

	public void CalculateSurfaceAreaOfSphere() {
		double radius = diameter / 2;
		double surfaceAAreaOfSphere = 4 * PI * radius * radius;
		System.out.println(surfaceAAreaOfSphere);
	}

	private boolean verifyDiameter(double d) {
		if (d > 0) {
			return true;
		} else {
			return false;
		}

	}
}
