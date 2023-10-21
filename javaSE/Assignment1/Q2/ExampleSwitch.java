/*2)	declare two numbers and one operator as a character. e.g. '+'
using switch... case check which operator is declared and accordingly perform the action. */
import java.util.Scanner;

public class ExampleSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num 2 : ");
		int num2 = sc.nextInt();
		System.out.println("Enter  : ");
		char a =sc.next().charAt(0);
		switch(a) {
		case'+':System.out.println(num1+num2);break;
		case'-':System.out.println(num1-num2);break;
		case'*':System.out.println(num1*num2);break;
		case'%':System.out.println(num1%num2);break;
		case'/':System.out.println(num1/num2);break;
		default:System.out.println("Not a Arithmatic Operator");
		}
	}
}
