

/*
 * Create class student with private member variable 
Prn_no, 
(subjects)
Java, c#, Html
Total
Percentage

Write method public void get_total()
Write method public void get_percentage()
Write method public string display() which will display Prn_no total percentage
Create 2 object of a class and display record.



 */
namespace ConsoleApp2
{
    class Student
    {
        int pnr_no;
        int java;
        int Csharp;
        int Html;
        int total;
        float percents;
        Student(int pnr_no,int java,int Csharp, int Html)
        {
            this.pnr_no = pnr_no;
            this.java = java;
            this.Csharp = Csharp;
            this.Html = Html;
        }
        public int GetTotal()
        {
            if(total==0)
            total=java+Csharp+Html;
            return total;
        }
        public float GetPercentage()
        {
            if (total!=0)
            {
                percents = total/4;
                return percents;
            }
            else { return 0; }
           
        }
        public void Disp()
        {
            Console.WriteLine("PNR of Student is : "+pnr_no);
            Console.WriteLine("Marks in java : "+java);
            Console.WriteLine("Marks in Csharp : "+Csharp);
            Console.WriteLine("Marks in Html : "+Html);
            Console.WriteLine("Total marks are : "+total);
            Console.WriteLine("Total percentage is :"+ percents);
            Console.WriteLine();
        }
    
        static void Main(string[] args)
        {
            Student [] arr = new Student[3];
            arr[0]=new Student(1, 88, 82, 91);
            arr[1]=new Student(2, 84, 81, 68);
            arr[2]=new Student(3, 72, 82, 75);

            for(int i = 0; i < arr.Length; i++) {
                arr[i].GetTotal();
                arr[i].GetPercentage();
                arr[i].Disp();


            }
            Console.ReadLine();
        }


    }

}
