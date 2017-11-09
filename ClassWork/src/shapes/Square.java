package shapes;

public class Square extends Rectangle {

	int side;

	public Square(int side) {
		super(side, side);
		this.side = side;
	}
	
	public double calculateArea() {
		
		return side*side;
	}


	public double calculatePerimeter() {
		
		return 4*side;
	}


	@Override
	public String toString() {
		
		return "Square Side Length: " + side + "  Area: " + this.calculateArea() + "  Perimeter:  " + this.calculatePerimeter();
	}

}
