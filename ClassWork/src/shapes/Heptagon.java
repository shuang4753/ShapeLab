package shapes;

/**
 * @author Simon + Nicholas Created 11/15/2017 Lab 2.1 shapes
 *
 */
public class Heptagon implements Shape {
	/**
	 * @param side
	 */
	private int side;
	private double pi = 3.14;
/**
 * Constructor for heptagon
 */
	public Heptagon(int side) {
		this.side = side;
		
	}

//Calculates area for heptagon = (7/4)a^2(cot(pi/7)), Also adds to total area calculated
	public double calculateArea() {
		
		return (1.75)*(side*side)*(Math.cos(pi/7)/Math.sin(pi/7));
	}

// perimeter is the 7 sides added up, Also adds to total perimeter calculated
	public double calculatePerimeter() {
		
		return 7*side;
	}

//prints to console
	public String toString() {
		return "Heptagon Side: " + side + "   Area: " +
				this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}