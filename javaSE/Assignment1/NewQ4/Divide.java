
//4) accept two numbers and devide them.


import java.util.Scanner;
class Devide
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1 : ");
        int num1= sc.nextInt();
        System.out.print("Enter the num2 : ");
        int num2= sc.nextInt();
        System.out.println("Division of two number is : "+(num1/num2));
    }
}
