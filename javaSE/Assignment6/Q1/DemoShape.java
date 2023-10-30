
/*
on developer side:

create interface "Shape" with "void draw();" method.

now define child classes 
	Triangle,Rect and Circle

create necessary jar file and documentation.


on Client side:

define "ShapeDemo" class with main function

create an array of "Shape" with 3 elements. store objects of Triangle,Rect and Circle in this array. 
now traverse the array and invoke "draw()" of each child.
*/
//client side:
package clientside;

import devpack.*;

public class DemoShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape [] s = new Shape[3];
		s[0]= new Triangle();
		s[1]= new Circle();
		s[2]= new Rectangle();
		
		for(int i=0;i<s.length;i++) {
			s[i].draw();
		}
	}

}
