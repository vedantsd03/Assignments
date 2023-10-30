/*
4) Create a class "Top1" with "disp1()" method.
From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
Now show how will u achieve dynamic polymorphism.
*/
package Problem1;

public class Demo4 {
	
	static void traverse(Top1 t) {
		t.disp1();
	}
	public static void main(String[] args) {
		traverse(new Bottom1());
		traverse(new Bottom2());
		traverse(new Bottom3());

	}

}
