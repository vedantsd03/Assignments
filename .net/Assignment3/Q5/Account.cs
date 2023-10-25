
/*
2.Open prevoius example of class Account 
as soon as you run your colde it should print name of bank
 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    class Account
    {
        string name;
        static int id;
        double balance;
        static Account()
        {
            Console.WriteLine("State Bank Of India");
        }
            Account(string name, double balance)
        {
            this.name = name;
            this.balance = balance;
            id = ++id;
        }
        public void deposit(double amt)
        {
            balance=balance+amt;
        }
        public void withdraw(int amt)
        {
            if (balance >amt)
                balance=balance-amt;
            else
                Console.WriteLine("Insufficent Balance");

        }
        public void Disp()
        {
            Console.WriteLine("Name of Customer is : "+name);
            Console.WriteLine("Balance is : "+balance);
            Console.WriteLine();
        }

        static void Main(string[] args)
        {
            Account acc1 = new Account("Bhushan", 3000);
            acc1.deposit(200);
            acc1.Disp();
            acc1.withdraw(200);
            acc1.Disp();
            acc1.withdraw(2800);
            acc1.Disp();
            acc1.withdraw(2000);
            acc1.Disp();
            Console.WriteLine();
            Account acc2 = new Account("Kunal", 4000);
            acc2.deposit(200);
            acc2.Disp();
            acc2.withdraw(500);
            acc2.Disp();
            acc2.deposit(2800);
            acc2.Disp();
            acc2.withdraw(2000);
            acc2.Disp();
        }
    }
}
