
/*
8) Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.
*/
package Sub;

public class Demo8 {

	public static void main(String[] args) {
		 new Sub1();
		System.out.println();
		new Sub1(11);
		System.out.println();
		new Sub1(11,12);

	}

}
