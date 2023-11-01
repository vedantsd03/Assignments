/*3)
create abstract class "Shape" with
	a contract "draw()" and concrete behaviour "show()"

create 3 child classes
	Triangle, Rectangle and Circle

define a class "ShapeDemo" with main
inside main create an array of "Shape" of 3 elements. Store all the child class objects inside the array, traverse it and invoke "draw()" and "show()" methods polymorphically.

*/
package Problem1;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		shape[0] = new Rectangle();
		shape[1] = new Circle();
		shape[2] = new Triangle();
		for (int i = 0; i < shape.length; i++) {
			shape[i].show();
			shape[i].draw();
			System.out.println();
		}
		
	}

}
