using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleFact
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Factorial.Class1 f = new Factorial.Class1();
            int num = f.fact(4);
            Console.WriteLine("Factorial is {0}",num);
            Console.ReadLine();
        }
    }
}
