
/*
8)	Define a parent class with one function.
Define child class with the function having same name as of parent class function, but having different argument.
Create an instance of child class and call the functions.
Make sure u have followed the concept of “function overloading “ in inheritance.
*/

package day_4_1;
public class Problem8demo {

	public static void main(String[] args) {
		Maharashtra m = new Maharashtra();
		m.area();
		m.area(10000);
	}
}
