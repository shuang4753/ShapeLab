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
		
		return (.5)*diagonal1*diagonal2;
	}


	public double calculatePerimeter() {
		
		return 2*(side1+side2);
	}


	public String toString() {
		return "Kite Diagonal 1: " + diagonal1 + " Diagonal 2: " + diagonal2 + "Side 1" + side1 + "Side 2" + side2 + "Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
