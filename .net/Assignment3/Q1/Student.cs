
/*
 Q1) create a class Student with member variable name,maths ,science,eng
create a method which will return total marks [300]
create a method which will display name and total.
 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    class Student
    {
        string name;
        int maths;
        int sci;
        int eng;
        int total;
        Student(string name,int maths,int sci, int eng)
        {
            this.name = name;
            this.maths = maths;
            this.sci = sci;
            this.eng = eng;
        }
        public int GetTotal()
        {
            if(total==0)
            total=maths+sci+eng;
            return total;
        }
        
        public void Disp()
        {
            Console.WriteLine("Name of Student is : "+name);
            Console.WriteLine("Total marks are : "+total);
            Console.WriteLine();
        }
    
        static void Main(string[] args)
        {
            Student [] arr = new Student[3];
            arr[0]=new Student("Omkar", 88, 82, 91);
            arr[1]=new Student("Sanket", 84, 81, 68);
            arr[2]=new Student("Anup", 72, 82, 75);

            for(int i = 0; i < arr.Length; i++) {
                arr[i].GetTotal();
                arr[i].Disp();
            }
        }
    }
}

