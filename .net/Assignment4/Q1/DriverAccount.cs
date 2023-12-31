/*using System.Security.Principal;

Create a Account class having instance member
 id, firstname, LastName, MiddleName, bal. 
Id should be generated by your application. 
Interest rate for  account is 7%. 
It has instance method 
public void deposit(double amt) who’s job is to increase the instance balance.
It has instance method 
public void withdraw(double amt) who’s job is to reduce the instance balance
 It has static method payint(public static double payint(Account obj)) 
who’s job is to calculate interest of each saving account holder and increase balanace and retun interest amount. 
Create instance method display who’s job is to display Name and bal. 
Create 3 object of account class. As soon as application load it should display name of bank.
Create 3 constructor let one constructor write logic to validate firstname can not be <3 character

*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    internal class DriverAccount
    {
        static void Main(string[] args)
        {
            Account a1 = new Account("omkar", "harishcharda", "sakpal", 1_00_000);
            Account a2 = new Account("sanket", "sanjay", "more", 90_000);
            Account a3 = new Account("sarthak", "shrikrishna", "dargalkar", 1_10_000);
           
            a1.Withdraw(30_000);
            a1.Deposit(5000);
            double amt1 = Account.Payint(a1);
            Console.WriteLine("After interest: "+amt1);
            a1.Disp();
            Console.WriteLine();

            a2.Withdraw(35_000);
            a2.Deposit(1500);
            double amt2 = Account.Payint(a2);
            Console.WriteLine("After interest "+amt2);
            a2.Disp();
            Console.WriteLine();


            a3.Withdraw(35_000);
            a3.Deposit(1000);
            double amt3 = Account.Payint(a3);
            Console.WriteLine("After interest "+amt3);
            a3.Disp();


        }
    }
}
