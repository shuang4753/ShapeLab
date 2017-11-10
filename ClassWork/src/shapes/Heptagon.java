package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Heptagon implements Shape {

	private int length;
	private int width;

	public Heptagon(int length, int width) {
		this.length = length;
		this.width = width;
	}


	public double calculateArea() {
		
		return length*width;
	}


	public double calculatePerimeter() {
		
		return 2*length+2*width;
	}


	public String toString() {
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}