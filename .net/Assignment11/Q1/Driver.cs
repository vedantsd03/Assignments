/*
 * Create class employee with member Id , EmpName salary and DetId
Create class Department with member DetId  DeptName[ADV, HR, ADMIN]
Create array of each class and store 6 object
Write query and display EmpName and name of Department
 */

namespace ConsoleApplication3
{
    class Employee
    {
        public int Id { get; set; }
        public string EmpName { get; set; }
        public int DeptId { get; set; }
        public int Salary { get; set; }
        public override string ToString()
        {
            return String.Format($"Employee ID : {Id} Employee Name : {EmpName} " +
                $"Department ID : {DeptId} Employee Salary : {Salary} ");
        }

    }

    class Dept
    {
        public int Id { get; set; }
        public string deptName { get; set; }

        public override string ToString()
        {
            return string.Format($"Department ID : {Id} Department Name : {deptName}");
        }

    }
    //POCO Class
    class Temp
    {
        public string DeptName { get; set; }
        public string Name { get; set; }

        public Temp(string deptName, string name)
        {

            DeptName = deptName;
            Name = name;
        }
    }

    class Driver
    {
        static void Main(string[] args)
        {
            Dept[] deptarr = new Dept[]
            {
                new Dept { Id=10, deptName="HR" } ,
                new Dept { Id=20, deptName="ADV" },
                new Dept { Id=30, deptName="MKT" },
             };
            Employee[] emparr = new Employee[]
            {
                new Employee { Id=1, EmpName="Raj", DeptId=10,Salary=50000 } ,
                new Employee { Id=2, EmpName="Raja", DeptId=10 ,Salary=40000 },
                new Employee { Id=3, EmpName="Rajani", DeptId=20 ,Salary=60000 },
                new Employee { Id=4, EmpName="Kavita", DeptId=30,Salary=45000 },
                new Employee { Id=5, EmpName="Vidya", DeptId=30,Salary=35000 },
                new Employee { Id=6, EmpName="Ganesh", DeptId=10,Salary=54000 },
            };

            var result = from e in emparr
                         join d in deptarr on e.DeptId equals d.Id
                         select new Temp(e.EmpName, d.deptName);

            foreach (Temp t in result)
                Console.WriteLine(t.DeptName+" "+ t.Name);
        }
    }
}

