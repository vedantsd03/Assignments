using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Calculator calculator = new Calculator();
            int sum =calculator.Add(10, 3);
            Console.WriteLine(sum);
            int pro=calculator.Product(20, 4);
            Console.WriteLine(pro);
        }
    }
}
