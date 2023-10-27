
/*
4) Define a class "DemoOb". 
create an instance of it.
now create a reference and assign the reference created in the above statement.
	Discuss what happens?
Now since u have 2 references, take one of the reference and assign a new instance of the class.
	Discuss what happens?
(For ur discussion, write necessary comments in the program)
*/


package Day2;
public class Demo {

	public static void main(String[] args) {
		DemoOb d1 = new DemoOb(100);
		System.out.println(d1.getNum()); //1
		DemoOb d2 = d1;
		System.out.println(d2.getNum()); //2
		d2=new DemoOb(200);		 //3
		System.out.println(d2.getNum());
		System.out.println(d1.getNum());
		
	}

}

