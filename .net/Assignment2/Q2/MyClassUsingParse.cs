using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{

    class MyClassUsingParse
    {
        public static float getSqr(float x)
        {
            return x*x;
        }
        static void Main(string[] args)
        {
            Console.WriteLine("Enter the number : ");
            string snum1 = Console.ReadLine();
            float f = float.Parse(snum1);
            Console.WriteLine(getSqr(f));
            Console.ReadLine();
        }

    }
}

