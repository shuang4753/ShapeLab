package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Kite implements Shape {

	private double diagonal1;
	private double diagonal2;
	private int side1;
	private int side2;

	public Kite(double diagonal1, double diagonal2, int side1, int side2) {
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
		this.side1 = side1;
		this.side2 = side2;
	}


	public double calculateArea() {
		
		return (1/2)*diagonal1*diagonal2;
	}


	public double calculatePerimeter() {
		
		return 2*(side1+side2);
	}


	public String toString() {
		return "Kite diagonal1: " + diagonal1 + " diagonal2: " + diagonal2 + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
