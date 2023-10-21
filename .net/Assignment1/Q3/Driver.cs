using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DAC
{
    internal class Student
    {
        public void disp() {
            Console.WriteLine("A Student From DAC");
        }
    }
}

namespace DBDA
{
    internal class Student
    {
        public void disp()
        {
            Console.WriteLine("A Student From DBDA");
        }
    }
}

namespace Driver
{
    internal class Driver
    {
        static void Main(string[] args)
        {
            DAC.Student s1 = new DAC.Student();
            s1.disp();
            DBDA.Student s2 = new DBDA.Student();
            s2.disp();
        }
    }
}
