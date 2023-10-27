
/*
2) Define a class "MyClass" and make sure clients can instantiate it , 
a) without any argument
b) with one int argument
c) with two int arguments
*/

package Day2;

public class MyClass {
	
	private int a;
	private int b;
	
	MyClass(){
		
	}
	
	MyClass(int a){
		this.a = a;
	}
	MyClass(int a,int b){
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass(10);
		MyClass m3 = new MyClass(10,12);
		System.out.println(m1.getA());
		System.out.println(m1.getB());
		
		System.out.println(m2.getA());
		System.out.println(m2.getB());
		
		System.out.println(m3.getA());
		System.out.println(m3.getB());
		
	}
}


