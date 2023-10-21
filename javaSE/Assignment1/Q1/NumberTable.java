/*
1)  display a table of a particular number 
*/import java.util.Scanner;

public class NumberTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number for you want to print table :");
		int num = sc.nextInt();
		for(int i =1;i<=10;i++) {
			System.out.println(num+ " * " + i +" = "+ (i*num));
		}
	}
}

