/*
1)create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access these attributes directly.
provide accessor methods on these attributes and allow them to call from outside of your class.
*/
package Day2;
public class Shape{
	public static void main(String[] args) 
	{	
		ShapeInfo s = new ShapeInfo(10,12);
		System.out.print("Height of shape is : ");
		System.out.println(s.getHeight());
		System.out.print("Widht of shape is : ");
		System.out.println(s.getWidth());

	}
}
