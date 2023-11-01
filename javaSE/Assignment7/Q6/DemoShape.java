/*6)on developer side:

create interface "Shape" with "void draw();" method.

now define child classes 
	Triangle,Rect and Circle



on Client side:

define "ShapeDemo" class with main and perform functions

define perform function in such a way that given any shape it can invoke "draw()" of it.
*/


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
