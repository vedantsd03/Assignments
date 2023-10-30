
package Sub;

class Child extends Parent1 implements Parent2{
	Child(int a) {
		super(a);
	}

	public void dispParent2(){
		System.out.println("From Parent2 disp method");
	}
}
