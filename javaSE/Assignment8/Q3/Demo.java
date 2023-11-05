/*3) define "MyException" as a checked exception.

define a class "Demo" with 
	public void show1(), public void show2() , public void show3() and main functions.

inside "show3()" accept a number and if it is greater than 10 raise "MyException" else display the number.
	[ this method shouldn't handle the exception]

main() function should call "show1()" , 
show1() function should call "show2()",
show2() function should call "show3()"

show2() should not handle the exception but show1() should handle.
*/

package Problem1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Enter the number try to less than 10 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Demo demo = new Demo();
		demo.show1(num);

	}

	public void show1(int num) {
		try {
			show2(num);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

	public void show2(int num)throws MyException {
		show3(num);
	}

	public void show3(int num) throws MyException {
		if(num>10) {
			throw new MyException("Number is greater than 10");
		}
		else {
			System.out.println("Number is less than 10");
		}
	}
}

