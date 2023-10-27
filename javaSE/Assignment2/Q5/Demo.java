/*
5) Define 3 classes A , B and C
in all these classes create static and nonstatic variables as well as methods.
	Now Define a class "Demo" ,in which define "main" function. 
From this main function try to access all the members of A ,B  and C.
*/


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



