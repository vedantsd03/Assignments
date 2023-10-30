/* 
1)Define 2 classes “First” and “Second” with member variables , member functions and constructors of  your choice.
Now define a class “Two” in which define main function . 
In main function create various instances of First and Second  and call their individual member functions.
*/
import package1.*;

public class Two {
	public static void main(String[] args) {
		First f1 = new First(24);
		System.out.println(f1.getNum());
		
		Second s1 = new Second(7);
		System.out.println(s1.getNum());
		s1 = new Second();
		System.out.println(s1.getNum());
	}
}
