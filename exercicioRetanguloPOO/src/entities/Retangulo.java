package entities;

public class Retangulo {

	public double width;
	public double hight;
	
	public double area() {
		return width * hight;
	}
	
	public double perimeter() {
		return 2 * (width + hight);
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(width, 2) + Math.pow(hight, 2)));
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f", area()) + "\n" + 
			   "PERIMETER = " + String.format("%.2f", perimeter()) + "\n" +
			   "DIAGONAL = " + String.format("%.2f", diagonal()) + "\n";				
	}
}
