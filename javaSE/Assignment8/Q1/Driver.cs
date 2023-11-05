/*
1) define your exception class by name "MyArithException"
(MyArithException.java)
define class "Calculator"   (Calculator.java)
In this class define a function,which will accept an int and return double of it.
e.g int caldouble(int)
This function will check an int which is passed to it
It will raise the  exception if 0 is passed or negative passed
in case of 0 caller of this method should get error message
"Zero not allowed" 
in case of negative caller of this method should get error message
"negative not allowed"
In case of positive value it should simply return the double value.
	[ this method shouldn't handle the exception]

Now define class "MyCalcApp" (MyCalcApp.java)
In this class you accept a number from user and pass that no. to
caldouble() method which is mentioned above.

*/

package Problem1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		try {
		int op = Calculator.caldouble(num);
		System.out.println(op);
		}
		catch( MyArithException a) {
			a.printStackTrace();
		}
	}
}
