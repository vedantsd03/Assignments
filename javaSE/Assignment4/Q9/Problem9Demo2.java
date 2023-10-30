/*
9)	Define a class “Shape” with “draw()” function .
Now derive  classes like “Circle”, “Polygon”,”Rectangle” etc. from “Shape” and override “draw()” function.
Define a class “ShapeDemo” in which  write  main()  function.
In the main function create a reference to Shape class referring to any of the sub class.
Using this reference, call “draw()” and check the result.
*/
//by creating the static method

package day_4_1;

//by creating the array of paerent class
class Problem9Demo2 {
	public static void main(String[] args) {
		Shape arr [] = new Shape[3];
		arr[0] = new Circle();
		arr[1] = new Polygon();
		arr[2] = new Rectangle();
	
		for(int i=0;i<arr.length;i++)
			arr[i].draw();
	}
}

