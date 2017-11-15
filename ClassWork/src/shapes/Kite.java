package shapes;

/**
 * @author Simon + Nicholas Created 11/15/2017 Lab 2.1 shapes
 *
 */
public class Kite implements Shape {

	/** 
	 * @param diagonal1
	 * @param diagonal2
	 * @param side1
	 * @param side2
	 */
	private int diagonal1;
	private int diagonal2;
	private int side1;
	private int side2;
/**
 * Constructor class for kites 
 */
	public Kite(int diagonal1, int diagonal2, int side1, int side2) {
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
		this.side1 = side1;
		this.side2 = side2;
	}

//Kite Area= (diagonal1*diagonal2)(.5)
	public double calculateArea() {
		
		return (.5)*diagonal1*diagonal2;
	}

//Kite Perimeter= 2*(side1+side2)
	public double calculatePerimeter() {
		
		return 2*(side1+side2);
	}

//Prints on the console. Also completes the interface
	public String toString() {
		return "Kite Diagonal 1: " + diagonal1 + "  Diagonal 2: " + diagonal2
				+ "  Side 1: " + side1 + "  Side 2: " + side2
				+ "  Area: " + this.calculateArea() 
				+ "  Perimeter: " + this.calculatePerimeter();
	}
}
