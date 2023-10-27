
//6) define static initializers in the above A,B and C classes and check the order of their execution.


package Day2;

public class Demo {

	public static void main(String[] args) {
		A a = new A(11);  
		System.out.println("Value of A class static member : "+A.getNums());
		System.out.println("Value of A class non staic member : "+a.getNum());
		
		B b = new B(22); 
		System.out.println("Value of A class static member : "+B.getNums());
		System.out.println("Value of A class non staic member : "+b.getNum());
		
		C c = new C(33);
		System.out.println("Value of A class static member : "+C.getNums());
		System.out.println("Value of A class non staic member : "+c.getNum());
		
	}

}
