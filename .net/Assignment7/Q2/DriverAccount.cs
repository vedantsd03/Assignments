/*
 * Create abstract class account having member id. name, balance
Id is generated by application It is readonly property for ID.
It has abstract method public abstract void withdraw(double amt);
It has static method public static double payinterest(); which will return interest and increase balance if account holder has positive balance
It has deposit method which will increase the balance.
Write getter setter for name 
Balance can be set only by child class.
It has static double int_rate=0.07
Create two child class Saving, Current
Initialise data by calling parentclass constructor
In saving account maintain minimum balance 1000 for this declare
Const double minbal=1000
In current account negative balance allowed.
Let both child class override withdraw method.
Create array of account class and store 2 object of saving account and current account.
Do the transaction. When you load it should print name of bank */


using Microsoft.VisualBasic;
using System.Security.Principal;

namespace ConsoleApp2
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Account[] accounts = new Account[2]
            {
                new Savings("Omkar"),
                new Current("Vedant")
            };

            Console.WriteLine("Initial balance");
            foreach (var acc in accounts)
                Console.WriteLine(acc);

            accounts[0].deposit(9999);
            accounts[1].deposit(678);

            Console.WriteLine("On Deposit: ");
            foreach (var acc in accounts)
                Console.WriteLine(acc);

            accounts[0].withdraw(8907);
            accounts[1].withdraw(2345);

            Console.WriteLine("On Withdraw: ");
            foreach (var acc in accounts)
                Console.WriteLine(acc);

        }
    }
}



