
/*
3. Create class Employee having memberId,Name,Salary,NetSalary,Dept d
Create enum Dept{MKT,ADMIN,ADV}
Create method public double paytax() { return tax amount and set netsalary(note: netsalary = salary-salary*p%)}
create method display to display name and netsalary and department
when you load application it should print name of company.
new Employee(1,"Raj",50000,Dept.MKT)
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    enum Dept
    {
        MKT,
        ADMIN,
        ADV
    }
    class Employee
    {
        static int mamber_id;
        string name;
        double salary;
        double net_salary;
        Dept d;
        static float roi = 0.7f;

        public Employee(string name, int salary, Dept d)
        {
            int id = ++mamber_id;
            this.name = name;
            this.salary = salary;
            this.d = d;

        }
        public double PayTax() 
        {
            net_salary = salary - salary * roi;
            return salary;
        }
        public void Display()
        {
            Console.WriteLine("Name of Employee : {0}\nNet Salary : {1}\nDepartment is : {2}\n",name,net_salary,d);
        }
    }

    class Driver
    {
        static void Main(string[] args)
        {
            Employee e1 = new Employee("Raj", 30000, Dept.MKT);
            e1.PayTax();
            e1.Display();
            Employee e2 = new Employee("Laxman", 45000, Dept.ADV);
            e2.PayTax();
            e2.Display();
            Employee e3 = new Employee("Sunil", 50000, Dept.ADMIN);
            e3.PayTax();
            e3.Display();
            Employee e4 = new Employee("Shweta", 45000, Dept.MKT);
            e4.PayTax();
            e4.Display();

        }
    }
}
