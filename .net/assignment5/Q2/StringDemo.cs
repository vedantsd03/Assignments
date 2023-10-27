/*
Q1.Create 2 string variable and accept data from user.
Using equals and == check data entered by user is same or not.
Print gethashcode for both string .variable
Also use referenceEquals and observe out put.*/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    internal class StringDemo
    {
       static void Main(string[] args)
        {
            Console.WriteLine("Enter First String : ");
            string str1 = Console.ReadLine();
            Console.WriteLine("Enter Second String : ");
            string str2 = Console.ReadLine();
            Console.WriteLine("Static Equals mtd : "+string.Equals(str1, str2));
            Console.WriteLine("Non Static Equals mtd: "+str1.Equals(str2));
            Console.WriteLine("using == operator: "+(str1==str2));
            Console.WriteLine("Reference Equals mtd: "+string.ReferenceEquals(str1,str2));
            Console.WriteLine("HashCode of Str1 : "+str1.GetHashCode());
            Console.WriteLine("HashCode of Str2 : "+str2.GetHashCode());

        }

    }
}
