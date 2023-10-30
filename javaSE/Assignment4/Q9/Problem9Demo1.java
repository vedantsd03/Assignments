/*
9)	Define a class “Shape” with “draw()” function .
Now derive  classes like “Circle”, “Polygon”,”Rectangle” etc. from “Shape” and override “draw()” function.
Define a class “ShapeDemo” in which  write  main()  function.
In the main function create a reference to Shape class referring to any of the sub class.
Using this reference, call “draw()” and check the result.
*/
//by creating the static method

package day_4_1;

class Problem9Demo1 {

	static void callShape(Shape s) {
		s.draw();
	}

	public static void main(String[] args) {
		callShape(new Circle());
		callShape(new Polygon());
		callShape(new Rectangle());

	}

}
