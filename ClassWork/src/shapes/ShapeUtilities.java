package shapes;

import java.util.Random;

/**
 * @author Simon + Nicholas Created 11/15/2017 Lab 2.1 shapes
 *a
 */

public class ShapeUtilities {

	/**
	 * Creates a random shape from the choices.
	 * 
	 * @return Shape Student Work: Update with your own shape.
	 */
	public static Shape randomShape() {
		Random rand = new Random();
		int x = rand.nextInt(5);

		switch (x) {
		case 0:
			return new Circle(rand.nextInt(100));
		case 1:
			return new Rectangle(rand.nextInt(50), rand.nextInt(50));
		case 2:
			return new Square(rand.nextInt(50));
		case 3:
			return new Heptagon(rand.nextInt(69));
		case 4:
			return new Kite(rand.nextInt(20), rand.nextInt(20), rand.nextInt(20), rand.nextInt(20));  
		default:
			return new Circle(rand.nextInt(100));
		}

	}

	/**
	 * adds up the area of all the shapes in the array
	 * need for loop to address each shape within the array called shapes
	 * because the first shape's index is 0, the variable counts up to length of array minus 1 
	 * after each shape is found, add its area to the double: totalArea.
	 * @param shapes
	 * @return double
	 */
	public static double sumArea(Shape[] shapes) {
		double totalArea = 0.0;
		for(int i = 0; i < shapes.length; i++)
		{
			totalArea = totalArea+ shapes[i].calculateArea(); 
		}
		return totalArea;
	}

	/**
	 * adds up the perimeter of all the shapes in the array
	 * need for loop to address each shape within the array called shapes
	 * because the first shape's index is 0, the variable counts up to length of array minus 1
	 * after each shape is found, add its perimeter to the double: totalPerimeter
	 * @param shapes
	 * @return double
	 */
	public static double sumPerimeter(Shape[] shapes) {
		double totalPerimeter = 0.0;
		for(int i = 0; i < shapes.length; i++)
		{
			totalPerimeter = totalPerimeter + shapes[i].calculatePerimeter(); 
		}
		return totalPerimeter;
		
	}

}
