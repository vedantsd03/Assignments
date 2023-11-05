/*4) on the developer side create following checked exception:
	InvalidLengthException
create necessary jar file and documentation.

on client side

public class Authenticator
	with
a parameterized constructor which takes String as a password.
this class also will have "done()" method with "successful authentication" message.
Parameterized constructor should check the length of the password passed if it is less than 5 or more that 9 , it should raise "InvalidLengthException" 
	[ constructor shouldn't handle the exception]

create a class "Demo" with main
	inside main function create the object of "Authenticator" class and invoke "done()" method.
*/ 


package clientpack;

import java.util.Scanner;

import devpack.InvalidLengthException;

public class Demo {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		try {
			Authenticator authenticator  = new Authenticator(s);
		} catch (InvalidLengthException e) {
			e.printStackTrace();
		}
	}
}
