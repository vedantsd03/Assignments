import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		if(a>60 && a<=100)
			System.out.println("you pass with First class");
		else if(a>50 && a<60)
			System.out.println("you pass with second class");
		else if(a>35&&a<50)
			System.out.println("you are Pass");
		else if(a<=35)
			System.out.println("you are Failed");
		else
			System.out.print("Wrong Input");
			
	}
}
