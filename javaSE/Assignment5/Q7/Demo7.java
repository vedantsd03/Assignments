
/*
7) Define class "Parent1" with some data.
Define interface "Parent2" with some methods.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.
*/
package Sub;

public class Demo7 {

	public static void main(String[] args) {
		Child c = new Child(10);
		System.out.println(c.a);
		c.dispParent1();
		c.dispParent2();
	}

}


