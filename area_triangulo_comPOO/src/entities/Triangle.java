package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;

	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public static void compararAreas(double x, double y) {
		if (x > y) {
			System.out.println("Maior área: X ");
		} else {
			System.out.println("Maior área: Y ");
		}
	}
}
