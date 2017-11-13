package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Heptagon implements Shape {

	private int side;
	

	public Heptagon(int side) {
		this.side = side;
		
	}


	public double calculateArea() {
		
		return (7/4)*side*side* (1/Math.tan(180/7));
	}


	public double calculatePerimeter() {
		
		return 7*side;
	}


	public String toString() {
		return "Heptagon Side: " + side + "Area: " +
				this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}