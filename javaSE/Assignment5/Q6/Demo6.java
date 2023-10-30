
/*
6) Define interface "A" with "disp1()" method.
Derive from "A", interface "B" with "disp2" method.
Derive class "C" , from "B".
Instantiate class "C" and call its members as well as derived from parent interfaces.
*/
package Problem1;

public class Demo6 {

	public static void main(String[] args) {
		C c = new C();
		c.disp11();
		c.disp22();
	}

}

