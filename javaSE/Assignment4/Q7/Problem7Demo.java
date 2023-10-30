//7)	Define a parent and a child class . Now explain function overriding with Example.
package day_4_1;
public class Problem7Demo {
	public static void main(String[] args) {
		
		House h1 = new House();
		h1.construct();
		
		Apartment h2 = new House();
		h2.construct();
	}
}

