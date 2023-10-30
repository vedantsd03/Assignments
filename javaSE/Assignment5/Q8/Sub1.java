
package Sub;

class Sub1 extends Base1 {
	Sub1() {
		super(10);
		System.out.println("NO arg constructor");
	}

	Sub1(int k) {
		super(10);
		System.out.println(k);
		System.out.println("from One Arg Constructor");
	}
	Sub1(int k,int j) {
		super(10);
		System.out.println(k + " "+j);
		System.out.println("From Two arg Constructor");
		
	}
}
