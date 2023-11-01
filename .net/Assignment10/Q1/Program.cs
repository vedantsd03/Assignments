 /*create the delegate void doJob(int a,intb)
 and multiplay and add method as the anonymous method */
 delegate void doJob(int a , int b);
 internal class Program
 {
     static void Main(string[] args)
     {
         doJob add, multi, total;
         add=delegate(int a,int b) { Console.WriteLine($"Addition is  : {a+b}"); };
         multi=delegate(int a,int b) { Console.WriteLine($"Multiplaction is  : {a*b}"); ; };

         total=add+multi;
         total(2, 7);
     }
 }
