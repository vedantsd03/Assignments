
/*
 Q3) Create class Employee with private vatiable id name salary,netsalary
create method public double Calculatesal()
which will return net salary. netsal= sal-sal*10%
create a method which will disply name and net salary.
create 3 object of a class and call display method.
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    class Employee
    {
        string name;
        static int id;
        double sal;
        double netsal;

        Employee(string name,double sal)
        {
            this.name = name;
            this.sal = sal;
            id = ++id;
           
        }

        public double Calculatesal()
        {
           return netsal= sal-sal*.1;
        }
        public void Disp()
        {
            Console.WriteLine("Name of Customer is : "+name);
            Console.WriteLine("Net salary is : "+netsal);
            Console.WriteLine();
        }
    
        static void Main(string[] args)
        {
            Employee [] arr = new Employee[3];
            arr[0]=new Employee("Omkar", 75000);
            arr[1]=new Employee("Nikhil", 75000);
            arr[2]=new Employee("Anup", 75000);

            for(int i = 0; i<arr.Length; i++)
            {
                arr[i].Calculatesal();
                arr[i].Disp();
            }
        }
    }
}

