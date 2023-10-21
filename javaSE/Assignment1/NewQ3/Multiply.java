
//3) accept two numbers and multiply them.

import java.util.Scanner;
class Multiply
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1 : ");
        int num1= sc.nextInt();
        System.out.print("Enter the num2 : ");
        int num2= sc.nextInt();
        System.out.println("Multiplaction of two number is : "+(num1*num2));
    }
}

