
/*
5) create abstract class Shape. declare "draw()" function as abstract. From this class define "Triangle","Polygon" and "Circle" .
create an array of Shape having 3 elements.
store child objects into this array . and call
their draw function.
*/
package Problem1;

public class Demo5 {
	
	static void drawShape(Shape s) {
		s.draw();
	}

	public static void main(String[] args) {
		drawShape(new Triangle());
		drawShape(new Polygon());
		drawShape(new Circle());
	}

}
